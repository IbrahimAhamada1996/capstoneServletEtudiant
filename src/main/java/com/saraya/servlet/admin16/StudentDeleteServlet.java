package com.saraya.servlet.admin16;

import com.saraya.service.StudentService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
@WebServlet(name = "StudentAdmin16DeleteServlet", value = "/home/admin16/delete")
public class StudentDeleteServlet extends HttpServlet {
    StudentService studentService = new StudentService();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String idDelete = req.getParameter("delete");
        int id  = Integer.parseInt(idDelete);
        System.out.println("id= " + id );
        studentService.delete(id);
        System.out.println("supprimer " );
        resp.sendRedirect("/home/admin16/list");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
