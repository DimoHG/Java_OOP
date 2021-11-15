package com.softuni.SOLID.impl.factories;

import com.softuni.SOLID.impl.MessageLogger;
import com.softuni.SOLID.interfaces.Appender;
import com.softuni.SOLID.interfaces.Factory;
import com.softuni.SOLID.interfaces.Logger;

public class LoggerFactory implements Factory<Logger> {
    AppenderFactory appenderFactory;

    public LoggerFactory() {
        this.appenderFactory = new AppenderFactory();
    }

    @Override
    public Logger produce(String input) {
       String[] tokens = input.split(System.lineSeparator());
       Appender[] appenders = new Appender[tokens.length];

        for (int i = 0; i < appenders.length; i++) {
            appenders[i] = this.appenderFactory.produce(tokens[i]);
        }

        return new MessageLogger(appenders);
    }
}
