package com.scaler.lowleveldesign.factoryDesign.components.Button;

public class WindowsButton implements Button{
    @Override
    public void clickButton() {
        System.out.println("Windows Button clicked");
    }
}
