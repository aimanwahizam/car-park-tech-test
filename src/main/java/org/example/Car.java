package org.example;

public class Car extends Vehicle{

    private final String type;
    private final int size;

    public Car() {
        type = "car";
        size = 1;
    }

    @Override
    public void park() {
        if (CarPark.isHasRegularSpots()) {
            CarPark.setRegularSpots(CarPark.getRegularSpots() - size);
            CarPark.setHasRegularSpots(CarPark.getRegularSpots() > 0);
            CarPark.setCarsParked(CarPark.getCarsParked() + 1);
            CarPark.printStatus(type);
        } else {
            System.out.println("No parking space available for a " + type + ".\n");
        }
    }
}
