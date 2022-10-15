
package com.driver;

public class Main {

    public static class A {
        public String meth(){
            return "Invoking method from class A";
        }
    }
    public static class B extends A{
        public String meth(){
            return "Method is overridden in Extendend class B";
        }
    }

    public static void main(String[] args) {
        B obj = new B();
        System.out.printf(obj.meth());
//        System.out.printf(obj.meth());

    }
  
}

/**

 Method Overriding
:


 Task 4:
 Now override methode meth of class A in class B, which returns the following string
 "Method is overridden in Extendend class B"
 Task 5:
 call this overridden method from obj of class B */