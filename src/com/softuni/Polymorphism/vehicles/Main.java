package com.softuni.Polymorphism.vehicles;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] tokens = scanner.nextLine().split(" ");
        double carFuelAmount = Double.parseDouble(tokens[1]);
        double carConsumption = Double.parseDouble(tokens[2]);
        Vehicle car = new Car(carFuelAmount, carConsumption);

        tokens = scanner.nextLine().split(" ");
        double truckFuelAmount = Double.parseDouble(tokens[1]);
        double truckConsumption = Double.parseDouble(tokens[2]);
        Vehicle truck = new Truck(truckFuelAmount, truckConsumption);

        Map<String, Vehicle> vehicles = new LinkedHashMap<>();
        vehicles.put("Car", car);
        vehicles.put("Truck", truck);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            tokens = scanner.nextLine().split(" ");
            String commandName = tokens[0];
            String vehicleType = tokens[1];

            switch (commandName) {
                case "Drive":
                    double distance = Double.parseDouble(tokens[2]);
                    System.out.println(vehicles.get(vehicleType).drive(distance));
                    break;
                case "Refuel":
                    double liters = Double.parseDouble(tokens[2]);
                    vehicles.get(vehicleType).refuel(liters);
                    break;
                default:
                    throw new IllegalArgumentException("No such command");
            }

        }

        vehicles.values().forEach(System.out::println);


    }
}
