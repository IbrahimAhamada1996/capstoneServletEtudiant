package com.saraya.servlet.admin16;

import com.saraya.service.StudentService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Student16ListServlet", value = "/home/admin16/list")
public class Student16ListServlet extends HttpServlet {
        StudentService studentService = new StudentService();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        System.out.println(studentService.getStudent());
             String idDelete = req.getParameter("delete");
            if (idDelete!=null){
                int id  = Integer.parseInt(idDelete);
                System.out.println("id= " + id );
                studentService.delete(id);
            }

        req.setAttribute("students",studentService.getStudents());

        req.getRequestDispatcher("/WEB-INF/view/admin16/list.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

      String idUpdate = req.getParameter("update");
        String index = req.getParameter("id");
        String firstname  = req.getParameter("firstname");
        String lasttname  = req.getParameter("lastname");
        String dateOfBirth  = req.getParameter("dateOfBirth");
        String registrationDate  = req.getParameter("registrationDate");
        int id=0 ;
        int index1 = 0;
        if (idUpdate!=null)
             id  = Integer.parseInt(idUpdate);
        if (index!=null)
            index1  = Integer.parseInt(index);

        if(firstname!=null && lasttname!=null&&dateOfBirth!=null&&registrationDate!=null){

            studentService.update(index1,studentService.getStudent(index1));


            resp.sendRedirect("/home/admin16/list");
        }else {
            req.setAttribute("student",studentService.getStudent(id));
            req.setAttribute("id",id);
            req.getRequestDispatcher("/WEB-INF/view/admin16/update.jsp").forward(req,resp);
        }



    }


}
