/*
link github:  
 */
package com.mycompany.ejertestparam;

import junitparams.JUnitParamsRunner;
import org.hamcrest.Matchers;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class CalculadoraTest {
    
    Calculadora c=new Calculadora();
    
    @Test
    @junitparams.Parameters({"1,3,4","5,5,10","6,8,14","98,1,99"})
    public void testSumaMethod( int x,int y, int z) {
        assertThat(c.suma(x, y),Matchers.is(z));
    }
    
    @Test
    @junitparams.Parameters({"1,3,-2","5,5,0","8,6,2","0,0,0"})
    public void testRestaMethod( int x,int y, int z) {
        assertThat(c.resta(x, y),Matchers.is(z));
    }
    
    @Test
    @junitparams.Parameters({"1,-3,-3","5,5,25","-6,-8,48","0,1,0"})
    public void testMultiplicacionMethod( int x,int y, int z) {
        assertThat(c.multimplicacion(x, y),Matchers.is(z));
    }
    
    @Test
    @junitparams.Parameters({"15,0,0","5,5,1","10,5,2","20,-5,-4"})
    public void testDivisionMethod( int x,int y, double z) {
        if(y==0){
            assertEquals(Double.NaN, c.division(x, y),0.000000000000);
        }else{
            assertThat(c.division(x, y),Matchers.is(z));
        }
    }
    
}
