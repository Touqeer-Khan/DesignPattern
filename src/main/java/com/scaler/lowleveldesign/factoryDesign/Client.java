package com.scaler.lowleveldesign.factoryDesign;

import com.scaler.lowleveldesign.factoryDesign.components.Button.Button;

public class Client {
    public static void main(String[] args) {
        flutter flutter = new flutter();

        factory factory=flutter.creatFactory("Android");

        Button button=factory.creatButton();

        button.clickButton();

    }
}
