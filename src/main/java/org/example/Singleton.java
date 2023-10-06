package org.example;

public class Singleton {

    //private static instance

    private static Singleton instance;

    //Private constructor to prevent external instantiation
    private Singleton() {
        //Initialization code if any
    }

    //public static method to get the instance
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }




    //other methods and data members
    public void doSomething() {
        System.out.println("Singleton is doing soemthing");

    }
}
