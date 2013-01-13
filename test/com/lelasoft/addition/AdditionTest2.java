/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lelasoft.addition;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 *
 * @author KhaledLela
 */
public class AdditionTest2 {

    private int x = 1;
    private int y = 2;

    @Test
    public void testAddition() {
        int z = x + y;
        assertEquals(3, z);
    }
}
