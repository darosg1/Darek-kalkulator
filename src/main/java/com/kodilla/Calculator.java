package com.kodilla;

public class Calculator
{
    int a = 10;
    int b = 5;

    public int addAToB (){
        return a+b;
    }
    public int subtractAFromB(){
        return (a-b);
    }
}
class Application
{
    public static void main (String [] args) throws java.lang.Exception{
        Calculator calculator = new Calculator();
        int result = calculator.addAToB();
        int result2 = calculator.subtractAFromB();
        System.out.println("A + B = "+result);
        System.out.println("A - B = "+result2);
    }
}