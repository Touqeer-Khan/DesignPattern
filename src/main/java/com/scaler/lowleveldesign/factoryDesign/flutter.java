package com.scaler.lowleveldesign.factoryDesign;

public class flutter {
    public void refreshUI(){
        System.out.println("refreshUI");

    }
    public void SetTheme(){
        System.out.println("SetTheme");
    }

    factory creatFactory(String platform){
        if(platform.equals("windows")){
            return new Windows();
        }else if(platform.equals("Android")){
            return new Android();
        }else if(platform.equals("IOS")){
            return new IOS();
        }else{
            return null;
        }
    }


}
