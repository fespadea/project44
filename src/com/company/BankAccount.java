package com.company;

/**
 * Created by fespa on 2/16/2017.
 */
public class BankAccount /*implements Comparable*/{
    public BankAccount(String nam, double bal) {
        balance = bal;
        name = nam;
    }
    public double balance;
    public String name;
    /*public int compareTo(Object n){
        BankAccount second = (BankAccount) n;
        /*int retValue;
        if(balance<second.balance){
            retValue=-1;
        }
        else if(balance>second.balance){
            retValue=1;
        }
        else{
            retValue=0;
        }
        return retValue;*//*
        return name.compareTo(second.name); //project 2
    }*/
}
