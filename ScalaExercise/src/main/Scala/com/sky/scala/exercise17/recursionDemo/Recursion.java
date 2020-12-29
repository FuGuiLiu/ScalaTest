package com.sky.scala.exercise17.recursionDemo;

/**
 * @author Administrator
 */
public class Recursion {
    public static void main(String[] args) {
        System.out.println(getRecursion(3));
    }

    public static Integer getRecursion(Integer i) {
        if (i == 0) {
            return i = 1;
        } else {
            return i * getRecursion(i - 1);
        }
    }
}
