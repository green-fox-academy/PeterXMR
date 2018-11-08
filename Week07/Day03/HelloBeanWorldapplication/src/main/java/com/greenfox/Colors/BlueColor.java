package com.greenfox.Colors;

import com.greenfox.MyColor;
import com.greenfox.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BlueColor implements MyColor {
    public BlueColor () {
    }

    @Autowired
    Printer printer;

    @Override
    public void printColor() {
        printer.log("It is blue in color...");
    }
}
