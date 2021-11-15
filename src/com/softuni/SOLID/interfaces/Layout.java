package com.softuni.SOLID.interfaces;

import com.softuni.SOLID.enums.ReportLevel;

public interface Layout {
    String format(String time, String message, ReportLevel reportLevel);
}
