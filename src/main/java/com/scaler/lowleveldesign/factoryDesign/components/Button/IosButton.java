package com.scaler.lowleveldesign.factoryDesign.components.Button;

public class IosButton implements Button {

    @Override
    public void clickButton() {
        System.out.println("clicking IosButton");
    }
}
