package com.softuni.SOLID.impl.layouts;

import com.softuni.SOLID.enums.ReportLevel;
import com.softuni.SOLID.interfaces.Layout;

public class SimpleLayout implements Layout {
    @Override
    public String format(String time, String message, ReportLevel reportLevel) {
        return String.format("%s - %s - %s", time, reportLevel, message);
    }
}
