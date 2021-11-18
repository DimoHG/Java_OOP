package com.softuni.Reflection.blackBoxInteger;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        Class<BlackBoxInt> clazz = BlackBoxInt.class; //Get meta info about BlackBoxInt.class
        Constructor<BlackBoxInt> constructor = clazz.getDeclaredConstructor(); //get empty constructor
        constructor.setAccessible(true); //make this constructor public
        BlackBoxInt blackBoxInt = constructor.newInstance(); // create blackBox instance

        Field innerValue = clazz.getDeclaredField("innerValue"); //get metadata regarding innerValue
        innerValue.setAccessible(true); //make it public

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        while (!"END".equals(input)) {
            String[] methodData = input.split("_");
            String methodName = methodData[0];
            int value = Integer.parseInt(methodData[1]);

            Method method = clazz.getDeclaredMethod(methodName, int.class); //get method from BlackBoxInt by its name and arguments(signature)
            method.setAccessible(true); // make the method public
            method.invoke(blackBoxInt, value); // call the method on the blackBoxInt instance we have

            System.out.println(innerValue.get(blackBoxInt)); // get the innerValue of blackBoxInt instance
            input = scanner.nextLine();
        }

    }
}
