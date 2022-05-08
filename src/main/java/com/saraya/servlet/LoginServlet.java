package com.saraya.servlet;

import com.saraya.service.LoginService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/login.do")
public class LoginServlet extends HttpServlet {

    private LoginService loginService = new LoginService();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.getRequestDispatcher("/WEB-INF/view/login.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password= req.getParameter("password");

        System.out.println("req = " + username + ", resp = " + password);
        if (this.loginService.connexionAdmin(username,password)){
            req.getSession().setAttribute("username",username);
            req.getSession().setAttribute("password",password);
            resp.sendRedirect("/home/admin/list");

        }else if (this.loginService.connexionAdmin6(username,password)){
            req.getSession().setAttribute("username",username);
            req.getSession().setAttribute("password",password);
            resp.sendRedirect("/home/admin6/list");

        }else if (this.loginService.connexionAdmin16(username,password)){
            req.getSession().setAttribute("username",username);
            req.getSession().setAttribute("password",password);
            resp.sendRedirect("/home/admin16/list");
        }else {
            resp.sendRedirect("/login.do");
        }
    }
}
