package com.haasjustin.abstractlab;

import java.util.Scanner;

/**
 * Created by justinhaas on 5/3/17.
 */
public class Account {

    public static void main(String[] args){
        ATM atm = new ATM();
        Business business = new Business();
        Checking checking = new Checking();
        Savings savings = new Savings();

        business.balance(atm.userInputTwo());
        checking.balance(atm.userInputTwo());
        savings.balance()



    }
}
