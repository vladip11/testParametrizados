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
public class PalindromoTest {
    
    Palindromo p = new Palindromo();

    @Parameterized.Parameters
    public static List<Object> datos() {
        //devolvera una lista
        return Arrays.asList(new Object[][]{
            {"otto",true},{"omo",true},{"roberto",false},{"rubor",false},{"cielo",false}
        });
    }
    
    @Parameterized.Parameter(0)
    public String valor1;
    @Parameterized.Parameter(1)
    public boolean valor2;
    
    
    @Test
    public void testSomeMethod() {
        assertEquals(valor2, p.buscaPalindromo(valor1));
    }
    
}
