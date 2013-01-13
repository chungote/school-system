/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lelasoft.addition;

/**
 *
 * @author KhaledLela
 */
import junit.framework.TestCase;
import org.junit.Test;

public class AdditionTest extends TestCase {

    private int x = 1;
    private int y = 2;

    @Test
    public void testAddition() {
        int z = x + y;
        assertEquals(3, z);
    }
}
