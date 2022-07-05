package org.example;

public class Van extends Vehicle{
    private final String type;
    private final int size;

    public Van() {
        type = "van";
        size = 3;
    }

    @Override
    public void park() {
        if (CarPark.getRegularSpots() >= 3) {
            CarPark.setRegularSpots(CarPark.getRegularSpots() - size);
            CarPark.setHasRegularSpots(CarPark.getRegularSpots() > 0);
            CarPark.setVansParked(CarPark.getVansParked() + 1);
            CarPark.printStatus(type);
        } else {
            System.out.println("No parking space available for a " + type + ".");
            if (CarPark.getRegularSpots() == 0) {
                System.out.println("There are no more regular spots!\n");
            } else {
                System.out.println("A van needs " + size + " spots.\nWe currently only have " + CarPark.getRegularSpots() + " spots.\n");
            }
        }
    }
}
