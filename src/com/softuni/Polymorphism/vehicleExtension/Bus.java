package com.softuni.Polymorphism.vehicleExtension;

public class Bus extends VehicleImpl {
    private static final double AC_ADDITIONAL_CONSUMPTION = 1.4;
    private boolean isEmpty;

    public Bus(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        super(fuelQuantity, fuelConsumption, tankCapacity);
        isEmpty = false;
    }

    @Override
    public void setFuelConsumption(double fuelConsumption) {
        if (!this.isEmpty) {
            super.setFuelConsumption(fuelConsumption + AC_ADDITIONAL_CONSUMPTION);
        }
    }

    public void setEmpty(boolean empty) {
        isEmpty = empty;
    }
}
