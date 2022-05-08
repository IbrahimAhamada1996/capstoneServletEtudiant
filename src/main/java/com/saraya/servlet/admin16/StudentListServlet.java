package com.saraya.servlet.admin16;

import com.saraya.model.Student;
import com.saraya.service.StudentService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;


@WebServlet(name = "StudentAdmin16ListServlet", value = "/home/admin16/list")
public class StudentListServlet extends HttpServlet {
    StudentService studentService = new StudentService();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        List<Student> students =  studentService.getStudents().stream()
                .filter(student -> student.getTrainingDuration().equalsIgnoreCase("16 Month"))
                .collect(Collectors.toList());

        req.setAttribute("students",students);

        req.getRequestDispatcher("/WEB-INF/view/admin16/studentList.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


    }
}
