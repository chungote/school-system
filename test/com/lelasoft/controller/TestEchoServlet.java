/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lelasoft.controller;

import org.junit.Test;

/**
 *
 * @author KhaledLela
 */
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;
import static org.junit.Assert.assertEquals;

public class TestEchoServlet {

    @Test
    public void testEchoingParametersWithMultipleValues()
            throws Exception {
        MockHttpServletRequest request = new MockHttpServletRequest();
        MockHttpServletResponse response = new MockHttpServletResponse();
        request.addParameter("param1", "param1value1");
        request.addParameter("param2", "param2value1");
        request.addParameter("param2", "param2value2");
        new EchoServlet().doGet(request, response);

        String[] lines = response.getContentAsString().split("\n");
        assertEquals(
                "Expected as many lines as we have parameter values",
                3, lines.length);
        assertEquals("param1=param1value1", lines[0]);
        assertEquals("param2=param2value1", lines[1]);
        assertEquals("param2=param2value2", lines[2]);
    }
}
