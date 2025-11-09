package com.scaler.lowleveldesign.AdapterStrategy;

public interface BankApi {
    double getBalance(String accountNumber);
    boolean sendMoney(String fromAccn, String toAccn, double amount);
}
