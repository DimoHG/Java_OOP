package com.softuni.SOLID.impl.factories;

import com.softuni.SOLID.enums.ReportLevel;
import com.softuni.SOLID.impl.appenders.ConsoleAppender;
import com.softuni.SOLID.impl.appenders.FileAppender;
import com.softuni.SOLID.interfaces.Appender;
import com.softuni.SOLID.interfaces.Factory;
import com.softuni.SOLID.interfaces.Layout;

public class AppenderFactory implements Factory<Appender> {

    private LayoutFactory layoutFactory;

    public AppenderFactory() {
        this.layoutFactory = new LayoutFactory();
    }

    @Override
    public Appender produce(String input) {
        String[] tokens = input.split(" ");

        String appenderType = tokens[0];
        String layoutType = tokens[1];

        Layout layout = layoutFactory.produce(layoutType);
        Appender appender = null;
        if (appenderType.equals("ConsoleAppender")) {
            appender = new ConsoleAppender(layout);
        } else if (appenderType.equals("FileAppender")) {
            appender = new FileAppender(layout);
        }

        if (tokens.length >= 3) {
            appender.setReportLevel(ReportLevel.valueOf(tokens[2]));
        }

        return appender;
    }
}
