package com.saraya.servlet.admin;

import com.saraya.service.StudentService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "StudentAdminListServlet", value = "/home/admin/list")
public class StudentListServlet extends HttpServlet {
        StudentService studentService = new StudentService();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        System.out.println(studentService.getStudent());


        req.setAttribute("students",studentService.getStudents());

        req.getRequestDispatcher("/WEB-INF/view/admin/studentList.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {



    }


}
