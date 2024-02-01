package com.encore.workshop.workshop2.bank.exercise;

import com.encore.workshop.workshop2.bank.entity.Account;

public class ExerciseAccount {
    public static void main(String[] args) {
        Account acc = new Account("CUST01", "소지섭", "1-22-333", 100000);

        System.out.println("=======================");
        System.out.println("고객번호 : " + acc.getCustId());
        System.out.println("고객명 : " + acc.getCustName());
        System.out.println("계좌번호 : " + acc.getAccountNumber());
        System.out.println("잔액 : " + acc.getBalance() + "원");
        System.out.println("=======================");

        acc.addBalance(10000);
        acc.subtractBalance(20000);
    }
}
