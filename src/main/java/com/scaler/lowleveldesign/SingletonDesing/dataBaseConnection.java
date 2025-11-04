package com.scaler.lowleveldesign.SingletonDesing;

public class dataBaseConnection {


    private static dataBaseConnection instance=null;

    private dataBaseConnection() {}

    /* double check locking------------
    ===================================*/
    public static dataBaseConnection getInstance() {
        if(instance==null){
            synchronized(dataBaseConnection.class){
                if(instance==null){
                    instance=new dataBaseConnection();
                }
            }

        }
        return instance;
    }
}
