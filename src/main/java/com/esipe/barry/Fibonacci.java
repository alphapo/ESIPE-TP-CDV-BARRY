package com.esipe.barry;

/**
 * Created by barry on 18/12/2017.
 */
public class Fibonacci {

    public static int fibonacci(int n) {
        if (n <= 1) return(n);
        return(fibonacci(n-2) + fibonacci(n-1));
    }
}
