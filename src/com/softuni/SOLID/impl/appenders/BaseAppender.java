package com.softuni.SOLID.impl.appenders;

import com.softuni.SOLID.interfaces.Appender;
import com.softuni.SOLID.interfaces.Layout;

public abstract class BaseAppender implements Appender {
    Layout layout;

    public BaseAppender(Layout layout) {
        this.layout = layout;
    }
}
