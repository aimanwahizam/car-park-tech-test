package org.example;

public class Motorcycle extends Vehicle{

    private final String type;
    private final int size;

    public Motorcycle() {
        type = "motorcycle";
        size = 1;
    }

    private void logPark() {
        CarPark.setMotorcyclesParked(CarPark.getMotorcyclesParked() + 1);
        CarPark.printStatus(type);
    }

    @Override
    public void park() {
        if (CarPark.isHasMotorcycleSpots()) {
            CarPark.setMotorcycleSpots(CarPark.getMotorcycleSpots() - size);
            CarPark.setHasMotorcycleSpots(CarPark.getMotorcycleSpots() > 0);
            logPark();
        } else if (!CarPark.isHasMotorcycleSpots() && CarPark.isHasRegularSpots()){
            CarPark.setRegularSpots(CarPark.getRegularSpots() - size);
            CarPark.setHasRegularSpots(CarPark.getRegularSpots() > 0);
            logPark();
        } else {
            System.out.println("No parking space available for a " + type + ".\n");
        }
    }
}
