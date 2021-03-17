package com.ss.march.AssignTwo;

import java.io.*;

import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "loginServelet", value = "/login")
public class loginServelet extends HttpServlet {


    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>Hello </h1>");
        out.println("</body></html>");
    }

    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException{
        res.setContentType("text/html");
        String userName = req.getParameter("username");
        String pw = req.getParameter("password");

        System.out.println("userName is "+userName);
        System.out.println("pw is "+pw);

        String myUser = "time";
        String myPass = "time";

        boolean isUser =(myUser.equals(userName) && pw.equals(myPass));

        PrintWriter printer = res.getWriter();
        printer.write("<html><body><div id='servletResponse' style='text-align: center;'>");
        if(isUser) {
            printer.write("<p style='color: green; font-size: large;'>Congratulations! <span style='text-transform: capitalize;'>"+userName+"MEEE</span>, You have logged in!</p>");
        } else {
            printer.write("<p style='color: red; font-size: large;'>Wrong! <span style='text-transform: capitalize;'>"+userName+"</span>, Wrong credentials</p>");
        }

        printer.write("</div></body></html>");
        printer.close();

    }

    public void destroy() {
    }
}