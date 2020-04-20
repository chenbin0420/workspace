package com.springboot.jsp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns="/myServlet2/*",description = "servlet注解注册")
public class MyServletAnnotation extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println( ">>>>>>doGet()<<<<<<" );
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println( ">>>>>>doPost()<<<<<<" );
        resp.setContentType("text/html");
        resp.setCharacterEncoding("utf-8");
        PrintWriter out = resp.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Hello Servlet Registration</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>这是：Servlet2</h1>");
        out.println("</body>");
        out.println("</html>");
        out.flush();
        out.close();
    }
}