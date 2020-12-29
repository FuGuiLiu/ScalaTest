package com.sky.scala.exercise10.superClass.javaTest;

public class Test {
    public static void main(String[] args) {
        A a = new A();
        A a2 = new B();
        a.sayHello();
        a2.sayHello();
    }
}

class A {
    public void sayHello() {
        System.out.println("helloa");
    }
}

class B extends A {
    @Override
    public void sayHello() {
        System.out.println("hellob");
    }
}
