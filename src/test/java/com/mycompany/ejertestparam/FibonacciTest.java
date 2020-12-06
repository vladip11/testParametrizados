
package com.mycompany.ejertestparam;

import java.util.List;
import org.assertj.core.util.Arrays;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

// Link GitHub:  https://github.com/vladip11/testParametrizados.git

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

// Link GitHub:  https://github.com/vladip11/testParametrizados.git