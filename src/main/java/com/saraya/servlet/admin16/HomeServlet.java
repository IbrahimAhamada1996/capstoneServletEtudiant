package com.saraya.servlet.admin16;

import com.saraya.model.Student;
import com.saraya.service.StudentService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;

@WebServlet(urlPatterns = "/home/admin16")
public class HomeServlet extends HttpServlet {
    StudentService studentService = new StudentService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.getRequestDispatcher("/WEB-INF/view/admin16/home.jsp").forward(req,resp);
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
        /*DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        formatter.format(dt);*/

        Student student = new Student(firstname,lastname,dateOfBirth,"16 month",registrationDate);
        studentService.add(student);
        req.setAttribute("students",studentService.getStudents());
        System.out.println("student = " + student);
        req.getRequestDispatcher("/WEB-INF/view/admin16/list.jsp").forward(req,resp);

    }
}
