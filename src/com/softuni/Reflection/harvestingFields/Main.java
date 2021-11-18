package com.softuni.Reflection.harvestingFields;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Class<RichSoilLand> clazz = RichSoilLand.class;
        Field[] declaredFields = clazz.getDeclaredFields();
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();



        while (!input.equals("HARVEST")) {
            //do work
            switch (input) {
                case "public":
                    Arrays.stream(declaredFields)
                            .filter(field -> Modifier.isPublic(field.getModifiers()))
                            .forEach(field -> {
                                printField(field);
                            });
                    break;
                case "private":
                    for (Field field : declaredFields) {
                        if (Modifier.isPrivate(field.getModifiers())) {
                            printField(field);
                        }
                    }
                    break;
                case "protected":
                    Arrays.stream(declaredFields)
                            .filter(field -> Modifier.isProtected(field.getModifiers()))
                            .forEach(Main::printField);
                    break;
                case "all":
                    Arrays.stream(declaredFields)
                            .forEach(Main::printField);
                    break;
            }
            input = scanner.nextLine();
        }
    }

    private static void printField(Field field) {
        System.out.printf("%s %s %s%n",
                Modifier.toString(field.getModifiers()),
                field.getType().getSimpleName(),
                field.getName());
    }
}
