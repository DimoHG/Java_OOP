package com.softuni.SOLID;

import java.util.Scanner;

public class InputParser {

    public String readLoggerInfo(Scanner scanner){
        int n = Integer.parseInt(scanner.nextLine());
        StringBuilder sb = new StringBuilder();

        while(n-- > 0){
            sb.append(scanner.nextLine()).append(System.lineSeparator());
        }

        return sb.toString();
    }
}
