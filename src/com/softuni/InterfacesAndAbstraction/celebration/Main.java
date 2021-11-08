package com.softuni.InterfacesAndAbstraction.celebration;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        List<Birthable> thingsWithBirthday = new ArrayList<>();
//        List<Pet> pets = new ArrayList<>();

        while (!input.equals("End")) {
            String[] tokens = input.split(" ");
            String objectType = tokens[0];
            switch (objectType) {
                case "Citizen":
                    //{name} {age} {id} {birthdate}
                    String citizenName = tokens[1];
                    int citizenAge = Integer.parseInt(tokens[2]);
                    String citizenId = tokens[3];
                    String citizenBirthDate = tokens[4];
                    Citizen citizen = new Citizen(citizenName, citizenAge, citizenId, citizenBirthDate);
                    thingsWithBirthday.add(citizen);
                    break;
                case "Pet":
                    String petName = tokens[1];
                    String petBirthDate = tokens[2];
                    Pet pet = new Pet(petName, petBirthDate);
                    thingsWithBirthday.add(pet);
                    break;
                case "Robot":
                    Robot robot = new Robot(tokens[1], tokens[2]);
                    break;
            }
            input = scanner.nextLine();
        }

        String year = scanner.nextLine();
        boolean isFound = false;
        for (Birthable thingWithABirthday : thingsWithBirthday){
            if (thingWithABirthday.getBirthDate().endsWith(year)) {
                //here -> don't print 'no output'
                isFound = true;
                System.out.println(thingWithABirthday.getBirthDate());
            }
        }

        if(!isFound){
//            System.out.println("<no output>");
        }

    }
}

