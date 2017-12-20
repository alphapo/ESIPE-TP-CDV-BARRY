package com.esipe.barry;


import java.util.Scanner;
/**
 * Created by barry on 18/12/2017.
 */
public class App
{
    public static void main( String[] args )
    {

        int n = 5;
        Scanner sc = new Scanner(System.in);

        System.out.println("Choisissez une valeur y/n >> ");
        String choice = sc.nextLine();

        if(choice.equals("y")) {
            System.out.println("Entrez la valeur: ");
            n = sc.nextInt();
        }

        System.out.println("\n");
        for(int i=1; i<=n; i++) {
            System.out.println(Fibonacci.fibonacci(i));
        }
    }

}
