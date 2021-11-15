package com.softuni.SOLID.impl.factories;

import com.softuni.SOLID.impl.layouts.SimpleLayout;
import com.softuni.SOLID.impl.layouts.XmlLayout;
import com.softuni.SOLID.interfaces.Factory;
import com.softuni.SOLID.interfaces.Layout;

public class LayoutFactory implements Factory<Layout> {
    @Override
    public Layout produce(String input) {
        Layout layout = null;

        if(input.equals("SimpleLayout")){
            layout = new SimpleLayout();
        } else if (input.equals("XmlLayout")){
            layout = new XmlLayout();
        }

        return layout;
    }
}
