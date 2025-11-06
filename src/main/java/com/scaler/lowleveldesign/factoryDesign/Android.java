package com.scaler.lowleveldesign.factoryDesign;

import com.scaler.lowleveldesign.factoryDesign.components.Button.AndroidButton;
//import com.scaler.lowleveldesign.factoryDesign.components.button.Button;

import java.awt.*;

public class Android implements factory{
    @Override
    public AndroidButton creatButton() {
        return new AndroidButton();
    }


//    @Override
//    public Menu creatMenu() {
//        return null;
//    }
}
