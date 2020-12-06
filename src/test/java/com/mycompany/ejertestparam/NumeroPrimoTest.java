/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejertestparam;

import java.util.List;
import org.assertj.core.util.Arrays;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class NumeroPrimoTest {
    
    NumeroPrimo n = new NumeroPrimo();

    @Parameterized.Parameters
    public static List<Object> datos() {
        //devolvera una lista
        return Arrays.asList(new Object[][]{
            {5,true},{1,true},{10,false},{4,false},{0,true}
        });
    }
    
    @Parameterized.Parameter(0)
    public int valor1;
    @Parameterized.Parameter(1)
    public boolean valor2;
    
    @Test
    public void testNumeroPrimoMethod() {
        assertEquals(valor2, n.validate(valor1));
    }
    
}
