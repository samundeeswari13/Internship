package com.qtech.intenship.daytwo;

public class MethodOverloading {
    int add(int a,int b) {
    return a+b;
}
    
    int add(int a,int b,int c) {
    return a+b+c;
    }
   
    float add(int a,float b) {
    return a+b;
    }
    
    float add(float a,float b) {
    return a+b;
    }

public static void main(String[]args)
{
    MethodOverloading m=new MethodOverloading();
    System.out.println(m.add(23,54));
    System.out.println(m.add(2,3,5));
    System.out.println(m.add(2.3f,45));
    System.out.println(m.add(21,56.8f));
    
    
}
}
