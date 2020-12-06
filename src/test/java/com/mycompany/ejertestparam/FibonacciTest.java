/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejertestparam;

import java.util.List;
import junitparams.JUnitParamsRunner;
import org.assertj.core.util.Arrays;
import org.hamcrest.Matchers;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author CAB COMPUTERS
 */

@RunWith(Parameterized.class)
public class FibonacciTest {
    
    Fibonacci f=new Fibonacci();
    
    @Parameterized.Parameters
    public static List<Object> datos() {
        //devolvera una lista
        return Arrays.asList(new Object[][]{
            {0,"0,1"},{1,"0,1,1"},{5,"0,1,1,2,3,5"},{10,"0,1,1,2,3,5,8"}
        });
    }
    
    @Parameterized.Parameter(0)
    public int valor1;
    @Parameterized.Parameter(1)
    public String valor2;
    
    
    @Test
    public void testFibonacciMethod() {
        assertEquals(valor2,f.bibonacci(valor1));
    }
    
}
