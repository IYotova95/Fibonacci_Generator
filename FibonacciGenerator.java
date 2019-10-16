package com.spartaglobal.Fibonachi;

public class FibonacciGenerator {
    private int fib1 = 0;
    private int fib2 = 1;
    private int fibNext = fib1 + fib2;
    private int fibEnd;
    private int i = 2;

    public FibonacciGenerator(int fibEnd) {
        this.fibEnd = fibEnd;
    }

    public void toGenerateFibonacci(){
        while (i < fibEnd){
            i = i + 1;
            fib1 = fib2;
            fib2 = fibNext;
            fibNext = fib1 + fib2;
          //  System.out.println(fibNext);
        }
        System.out.println(fibNext);
    }

}

