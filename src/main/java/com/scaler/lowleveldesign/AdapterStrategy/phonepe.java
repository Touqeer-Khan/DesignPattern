package com.scaler.lowleveldesign.AdapterStrategy;

public class phonepe {
    public static void main(String[] args) {
//        BankApi bankApi=new ICICIBankAdapter();
//
//        String p1AccnNum="1234";
//        String p2AccnNum="5678";
//
//        double amount=1000;
//
//        bankApi.sendMoney(p1AccnNum, p2AccnNum, amount);

        BankApi bankApi=new YESBankApiAdapter();

        String p1AccnNum="1234";
        String p2AccnNum="5678";

        double amount=1000;

        bankApi.sendMoney(p1AccnNum, p2AccnNum, amount);

        System.out.println("debug");


    }
}
