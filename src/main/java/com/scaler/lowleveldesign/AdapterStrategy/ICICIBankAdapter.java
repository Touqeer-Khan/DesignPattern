package com.scaler.lowleveldesign.AdapterStrategy;

public class ICICIBankAdapter implements BankApi{

    ICICIBankApi iciciBankApi=new ICICIBankApi();

    @Override
    public double getBalance(String accountNumber) {
        return 0;
    }

    @Override
    public boolean sendMoney(String fromAccn, String toAccn, double amount) {
        System.out.println("ICICI API: Sending " + amount + " rs from " + fromAccn + " to " + toAccn);
        return false;
    }
}
