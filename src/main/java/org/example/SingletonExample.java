package org.example;

// Press ⇧ twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class SingletonExample {
   public static void main(String[] args){
       //Get the singleton Instance
        Singleton singleton = Singleton.getInstance();

        //call a method on the singleton instance
        singleton.doSomething();
    }
}