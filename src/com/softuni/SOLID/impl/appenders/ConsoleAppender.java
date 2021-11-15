package com.softuni.SOLID.impl.appenders;

import com.softuni.SOLID.enums.ReportLevel;
import com.softuni.SOLID.interfaces.Layout;

public class ConsoleAppender extends BaseAppender {

    public ConsoleAppender(Layout layout) {
        super(layout);
    }

    @Override
    public void append(String time, String message, ReportLevel reportLevel) {
        String formattedMessage = this.layout.format(time, message, reportLevel);
        System.out.println(formattedMessage);
    }
}
