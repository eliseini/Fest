package com.company;

public class Main {

    public static void main(String[] args) {
      int n=0;
        System.out.println(fibonacci(3));

    }
    public static int fibonacci(int n) {

        if(n<=1){



            return n;
        }
        return fibonacci(n-1)+(n-2);
    }

}

