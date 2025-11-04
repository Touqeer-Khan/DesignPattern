package com.scaler.lowleveldesign.SingletonDesing;

public class main {
    public static void main(String[] args) {

        dataBaseConnection db= dataBaseConnection.getInstance();
        dataBaseConnection db2= dataBaseConnection.getInstance();
        dataBaseConnection db3= dataBaseConnection.getInstance();

        System.out.println(db);
        System.out.println(db2);
        System.out.println(db3);


    }
}
