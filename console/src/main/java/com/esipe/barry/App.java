package com.esipe.barry;


import org.apache.log4j.Logger;

import java.util.Scanner;

/**
 * Created by barry on 18/12/2017.
 */
public class App
{
    final static Logger logger = Logger.getLogger(App.class);


    public static void main( String[] args )
    {
        App.class.getClassLoader().getResource("log4j.properties");


        int n = 5;
        Scanner sc = new Scanner(System.in);

        logger.info("Choisissez une valeur y/n >> ");
        String choice = sc.nextLine();

        if(choice.equals("y")) {
            logger.info("Entrez la valeur: ");
            n = sc.nextInt();
        }

        logger.info("\n");
        for(int i=1; i<=n; i++) {
            logger.info(Fibonacci.fibonacci(i));
        }
    }

}
