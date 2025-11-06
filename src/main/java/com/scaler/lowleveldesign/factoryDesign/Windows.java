package com.scaler.lowleveldesign.factoryDesign;

import com.scaler.lowleveldesign.factoryDesign.components.Button.WindowsButton;

import java.awt.*;

public class Windows implements factory{


    @Override
    public WindowsButton creatButton() {
        return new WindowsButton();
    }

//    @Override
//    public Menu createMenu() {
//        return null;

}
