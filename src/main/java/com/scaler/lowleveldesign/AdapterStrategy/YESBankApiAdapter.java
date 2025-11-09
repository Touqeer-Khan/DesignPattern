package com.scaler.lowleveldesign.AdapterStrategy;

public class YESBankApiAdapter implements BankApi {

    YESBankApi yesBankApi=new YESBankApi();

    @Override
    public double getBalance(String accountNumber) {
        return 0;
    }

    @Override
    public boolean sendMoney(String fromAccn, String toAccn, double amount) {
        System.out.println("YES API: Sending " + amount + " rs from " + fromAccn + " to " + toAccn);
        return false;
    }
}
