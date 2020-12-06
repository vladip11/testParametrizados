
package com.mycompany.ejertestparam;

import java.util.List;
import org.assertj.core.util.Arrays;
import org.hamcrest.Matchers;
import static org.junit.Assert.assertThat;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

// Link GitHub:  https://github.com/vladip11/testParametrizados.git

@RunWith(Parameterized.class)
public class TrianguloTest {
    
    @Parameterized.Parameters
    public static List<Object> datos() {
        //devolvera una lista
        return Arrays.asList(new Object[][]{
            {25,25,25,"Equilatero"},{12,12,15,"Isoceles"},{4,5,7,"Escaleno"}
        });
    }
    @Parameterized.Parameter(0)
    public int valor1;
    @Parameterized.Parameter(1)
    public int valor2;
    @Parameterized.Parameter(2)
    public int valor3;
    @Parameterized.Parameter(3)
    public String valor4;
    
    Triangulo t=new Triangulo();
    
    @Test
    public void testTipoTrianguloMethod() {
        assertThat(t.tipoTriangulo(valor1, valor2, valor3), Matchers.is(valor4));
    }
    
}

// Link GitHub:  https://github.com/vladip11/testParametrizados.git