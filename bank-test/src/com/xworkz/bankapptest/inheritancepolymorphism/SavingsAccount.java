package com.xworkz.bankapptest.inheritancepolymorphism;

import com.xworkz.bankapptest.inheritancepolymorphism.BankAccountt;

public class SavingsAccount extends BankAccountt {

    //runtime polymorphism
    @Override
    public void credit(){
        System.out.println("money credited to saving account");
    }
    //constructor chaining
    //default constructor
    public SavingsAccount(){

    }
    //parameterized constructor
    public SavingsAccount(double minBalance){

    }
}
