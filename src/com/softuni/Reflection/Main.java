package com.softuni.Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        Class<MySoftuniClass> mySoftuniClassInfo = MySoftuniClass.class;
        Field[] fields = mySoftuniClassInfo.getDeclaredFields();
        Method[] methods = mySoftuniClassInfo.getDeclaredMethods();
//        methods[0].
        Constructor[] constructors = mySoftuniClassInfo.getDeclaredConstructors();
    }
}
