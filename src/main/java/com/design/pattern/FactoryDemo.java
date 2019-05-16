package com.design.pattern;

enum VehicleType {
    TwoWheeler,
    FourWheeler
}

abstract class Vehicle {
    public abstract void printVehicle();
}

class TwoWheeler extends Vehicle {

    @Override
    public void printVehicle() {
        System.out.println("I am two wheeler");
    }
}

class FourWheeler extends Vehicle {
    @Override
    public void printVehicle() {
        System.out.println("I am four wheeler");
    }
}

class VehicleFactory {
    public static Vehicle getVehicle(VehicleType vehicleType) {
        Vehicle vehicle = null;

        switch (vehicleType) {
            case TwoWheeler:
                vehicle = new TwoWheeler();
                break;
            case FourWheeler:
                vehicle = new FourWheeler();
                break;
            default:
                vehicle = new TwoWheeler();
                break;
        }
        return vehicle;
    }
}

public class FactoryDemo {

    public static void main(String[] args) {
        Vehicle vehicle = VehicleFactory.getVehicle(VehicleType.FourWheeler);
        vehicle.printVehicle();
    }


}
