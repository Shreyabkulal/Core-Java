package com.xworkz.bankapptest;

import com.xworkz.bankapptest.Encapsulation.BankAccount;
import com.xworkz.bankapptest.inheritancepolymorphism.BankAccountt;
import com.xworkz.bankapptest.inheritancepolymorphism.SavingsAccount;

public class BankTestRunner {
    public static void main(String[] args) {

        //inheritance
        SavingsAccount sav = new SavingsAccount();
        sav.debit();

        //polymorphism -parent class ref, but object is of child type
        //runtime polymorphism
        BankAccountt b = new SavingsAccount();

        b.credit();

        //this is of encapsulation
        BankAccount bank = new BankAccount();
        bank.setId(1);
        System.out.println("id: "+bank.getId());

    }
}
