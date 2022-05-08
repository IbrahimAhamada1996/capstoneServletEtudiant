package com.saraya.servlet.admin16;

import com.saraya.model.Student;
import com.saraya.service.StudentService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.time.LocalDate;
@WebServlet(name = "Student16ListServlet", value = "/home/admin16/update")
public class StudentUpdateServlet extends HttpServlet {
    StudentService studentService = new StudentService();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String idUpdate = req.getParameter("update");
        int id = Integer.parseInt(idUpdate);


        req.setAttribute("student",studentService.getStudent(id));
        req.setAttribute("id",id);
        req.getRequestDispatcher("/WEB-INF/view/admin16/studentUpdate.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String firstname  = req.getParameter("firstname");
        String lastname  = req.getParameter("lastname");
        String dateOfBirthParam  = req.getParameter("dateOfBirth");
        String registrationDateParam   = req.getParameter("registrationDate");
        String index = req.getParameter("id");


        LocalDate dateOfBirth = null;
        LocalDate registrationDate = null;
        if(dateOfBirthParam != null && registrationDateParam != null){
            dateOfBirth = LocalDate.parse(dateOfBirthParam);
            registrationDate = LocalDate.parse(registrationDateParam);
        }

        Student student = new Student(firstname,lastname,dateOfBirth,"16 month",registrationDate);
        int id = Integer.parseInt(index);
        studentService.update(id,student);
        System.out.println("update " );
        resp.sendRedirect("/home/admin16/list");
    }
}
