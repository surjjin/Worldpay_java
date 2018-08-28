package com;
class A{
    String s[];
    public static void display(){
        System.out.println("display from A's method");
    }
    public static void main(String[] args) {
        A.display();
        
        B.main(new A().s);
    }
}