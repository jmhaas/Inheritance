package com.haasjustin.abstractlab;

import java.util.Scanner;

/**
 * Created by justinhaas on 5/3/17.
 */
public class ATM {
    Scanner inp= new Scanner(System.in);

    public int userInput(){
        return inp.nextInt();
    }
    public String userName(){
        return inp.toString();
    }

    public double userInputTwo(){
        return inp.nextInt();
    }
}
