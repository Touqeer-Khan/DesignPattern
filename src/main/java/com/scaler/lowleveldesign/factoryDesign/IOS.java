package com.scaler.lowleveldesign.factoryDesign;

import com.scaler.lowleveldesign.factoryDesign.components.Button.IosButton;

import java.awt.*;

public class IOS implements factory{

    @Override
    public IosButton creatButton() {
        return new IosButton();
    }
}

//    @Override
//    public Menu createMenu() {
//        return null;
//    }

