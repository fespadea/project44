package com.company;

import java.util.Comparator;

/**
 * Created by fespa on 2/16/2017.
 */
public class BA_comparable implements Comparator {
    public int compare(Object one, Object two){
        BankAccount first = (BankAccount) one;
        BankAccount second = (BankAccount) two;
        int retValue;
        if(first.balance<second.balance){
            retValue=-1;
        }
        else if(first.balance>second.balance){
            retValue=1;
        }
        else{
            retValue=0;
        }
        return retValue; // Project 3
    }
}
