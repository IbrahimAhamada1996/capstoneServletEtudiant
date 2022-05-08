package com.saraya.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter(urlPatterns = "/home/*")
public class AdminFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("init");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) servletRequest;
        HttpServletResponse resp = (HttpServletResponse) servletResponse;
        System.out.println("username = " + req.getSession().getAttribute("username") +" username = "+ req.getSession().getAttribute("password"));
        if(req.getSession().getAttribute("username")!=null && req.getSession().getAttribute("password")!=null){
            System.out.println("doFilter pass ");
            filterChain.doFilter(servletRequest, servletResponse);
        }else{
            System.out.println("doFilter no allow");
            resp.sendRedirect("/login.do");

        }


    }

    @Override
    public void destroy() {
        System.out.println("destroy");
    }
}
