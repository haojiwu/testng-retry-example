package com.myProject;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args){
        MyClass c = new MyClass();
        int ret = c.sum(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
        System.out.println("Hello World! " + String.valueOf(ret));
    }
}
