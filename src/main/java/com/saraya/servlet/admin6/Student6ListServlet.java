package com.saraya.servlet.admin6;

import com.saraya.service.StudentService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "Student6ListServlet", value = "/home/admin6/list")
public class Student6ListServlet extends HttpServlet {
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

        req.getRequestDispatcher("/WEB-INF/view/admin6/list.jsp").forward(req,resp);
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


            resp.sendRedirect("/home/admin6/list");
        }else {
            req.setAttribute("student",studentService.getStudent(id));
            req.setAttribute("id",id);
            req.getRequestDispatcher("/WEB-INF/view/admin6/update.jsp").forward(req,resp);
        }



    }


}
