package com.softuni.SOLID.interfaces;

import com.softuni.SOLID.enums.ReportLevel;

public interface Appender {
    void append(String time, String message, ReportLevel reportLevel);
}
