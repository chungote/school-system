/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lelasoft.controller;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.Enumeration;

public class EchoServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setHeader("Content-Type", "text/plain");
        PrintWriter writer = response.getWriter();
        Enumeration e = request.getParameterNames();
        while (e.hasMoreElements()) {
            String parameter = String.valueOf(e.nextElement());
            String[] values = request.getParameterValues(parameter);
            for (int i = 0; i < values.length; i++) {
                writer.write(parameter + "=" + values[i]);
                writer.write("\n");
            }

        }
        writer.close();
    }
}
