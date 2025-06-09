package com.newpc.SimpleCalci;

import com.newpc.SimpleCalci.MySimpleCalci;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
		MySimpleCalci c = new MySimpleCalci();
		int a=10;
		int b=5;
		System.out.println(a + " + " + b  + " = " + c.addition(a, b));	
		System.out.println(a + " - " + b  + " = " + c.subtraction(a, b));	
		System.out.println(a + " * " + b  + " = " + c.multiplication(a, b));	
		System.out.println(a + " / " + b  + " = " + c.division(a, b));	
		System.out.println(a + " % " + b  + " = " + c.remainder(a, b));	

    }
}
