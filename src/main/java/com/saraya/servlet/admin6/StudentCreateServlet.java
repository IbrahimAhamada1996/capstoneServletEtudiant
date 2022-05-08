package com.saraya.servlet.admin6;

import com.saraya.model.Student;
import com.saraya.service.StudentService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.time.LocalDate;

@WebServlet(urlPatterns = "/home/admin6/create")
public class StudentCreateServlet extends HttpServlet {
    StudentService studentService = new StudentService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.getRequestDispatcher("/WEB-INF/view/admin6/studentCreate.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        createStudent(req,resp);
    }

    public void createStudent(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        String firstname = (String) req.getParameter("firstname");
        String lastname = req.getParameter("lastname");
        String dateOfBirthParam =(String) req.getParameter("dateOfBirth");
        String registrationDateParam = req.getParameter("registrationDate");

        LocalDate dateOfBirth = null;
        LocalDate registrationDate = null;
        if(dateOfBirthParam != null && registrationDateParam != null){
            dateOfBirth = LocalDate.parse(dateOfBirthParam);
            registrationDate = LocalDate.parse(registrationDateParam);
        }

        Student student = new Student(firstname,lastname,dateOfBirth,"6 month",registrationDate);
        studentService.add(student);
        req.setAttribute("students",studentService.getStudents());
        System.out.println("student = " + student);
        resp.sendRedirect("/home/admin6/list");

    }
}
