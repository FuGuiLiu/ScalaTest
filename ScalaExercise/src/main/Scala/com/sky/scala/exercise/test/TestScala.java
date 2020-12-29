package com.sky.scala.exercise.test;

/**
 * @author Administrator
 */


class HelloScala {
    public static void main(String[] paramArrayOfString) {
        HelloScala$.MODULE$.main(paramArrayOfString);
    }
}

final class HelloScala$ {
    public static final HelloScala$ MODULE$ = new HelloScala$();

    public void main(String[] args) {
        System.out.println("反编译测试");
    }
}