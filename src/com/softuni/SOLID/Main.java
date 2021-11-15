package com.softuni.SOLID;

import com.softuni.SOLID.impl.MessageLogger;
import com.softuni.SOLID.impl.SimpleLayout;
import com.softuni.SOLID.impl.appenders.ConsoleAppender;
import com.softuni.SOLID.impl.appenders.FileAppender;
import com.softuni.SOLID.impl.appenders.LogFile;
import com.softuni.SOLID.interfaces.Appender;
import com.softuni.SOLID.interfaces.File;
import com.softuni.SOLID.interfaces.Layout;
import com.softuni.SOLID.interfaces.Logger;

public class Main {
    public static void main(String[] args) {
        Layout simpleLayout = new SimpleLayout();
        Appender consoleAppender = new ConsoleAppender(simpleLayout);

        File file = new LogFile();
        Appender fileAppender = new FileAppender(simpleLayout);
        ((FileAppender) fileAppender).setFile(file);

        Logger logger = new MessageLogger(consoleAppender, fileAppender);

        logger.logError("3/26/2015 2:08:11 PM", "Error parsing JSON.");
        logger.logInfo("3/26/2015 2:08:11 PM", "User Pesho successfully registered.");

    }
}
