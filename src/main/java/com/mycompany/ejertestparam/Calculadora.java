package com.mycompany.ejertestparam;

public class Calculadora {
    public int suma(int a, int b){
    return a+b;
    }
    public int resta(int a, int b){
    return a-b;
    }
    public int multimplicacion(int a, int b){
    return a*b;
    }
    public double division(int a, int b){
        if (b==0) {
            return Double.NaN;
        }
    return a/b;
    }
}
