package org.example;

public class CarPark {
    // STATIC CLASS
    private static int motorcycleSpots;
    private static int regularSpots;
    private static final int maxSize;

    private static boolean hasMotorcycleSpots;
    private static boolean hasRegularSpots;

    private static int motorcyclesParked = 0;
    private static int carsParked = 0;
    private static int vansParked = 0;


    static {
        maxSize = 10;
        motorcycleSpots = (int) ((Math.random() * maxSize) + 1);
        regularSpots = maxSize - motorcycleSpots;
        hasMotorcycleSpots = motorcycleSpots != 0;
        hasRegularSpots = regularSpots != 0;
    }

    public static int getMotorcycleSpots() {
        return motorcycleSpots;
    }

    public static int getRegularSpots() {
        return regularSpots;
    }

    public static boolean isHasMotorcycleSpots() {
        return hasMotorcycleSpots;
    }

    public static boolean isHasRegularSpots() {
        return hasRegularSpots;
    }

    public static int getMotorcyclesParked() {
        return motorcyclesParked;
    }

    public static int getCarsParked() {
        return carsParked;
    }

    public static int getVansParked() {
        return vansParked;
    }

    public static void setHasMotorcycleSpots(boolean hasMotorcycleSpots) {
        CarPark.hasMotorcycleSpots = hasMotorcycleSpots;
    }

    public static void setHasRegularSpots(boolean hasRegularSpots) {
        CarPark.hasRegularSpots = hasRegularSpots;
    }

    public static void setMotorcycleSpots(int motorcycleSpots) {
        CarPark.motorcycleSpots = motorcycleSpots;
    }

    public static void setRegularSpots(int regularSpots) {
        CarPark.regularSpots = regularSpots;
    }

    public static void setMotorcyclesParked(int motorcyclesParked) {
        CarPark.motorcyclesParked = motorcyclesParked;
    }

    public static void setCarsParked(int carsParked) {
        CarPark.carsParked = carsParked;
    }

    public static void setVansParked(int vansParked) {
        CarPark.vansParked = vansParked;
    }

    public static void printStatus(String type) {
        System.out.println("A " + type + " was parked.\n");
        System.out.println("Currently, there are: \n" + motorcyclesParked + " motorcycles parked\n" + carsParked + " cars parked\n" + vansParked + " vans parked. \n");
        if (hasRegularSpots && hasMotorcycleSpots) {
            System.out.println("The current vacancy is now: \n" + motorcycleSpots + " motorcycle spots \n" + regularSpots + " regular spots.\n");
        } else if (!hasMotorcycleSpots && hasRegularSpots) {
            System.out.println("No more motorcycles spots.");
            System.out.println("But, we have " + regularSpots + " available regular spots.\n");
        } else if (!hasRegularSpots && hasMotorcycleSpots) {
            System.out.println("No more regular spots.");
            System.out.println("But, we have " + motorcycleSpots + " available motorcycle spots.\n");
        } else if (!hasMotorcycleSpots && !hasRegularSpots) {
            System.out.println("The car park is now full!");
        }
    }

    static {
        System.out.println("Initial vacancy: \n" + motorcycleSpots + " motorcycle spots\n" + regularSpots + " regular spots.\n");
    }
}
