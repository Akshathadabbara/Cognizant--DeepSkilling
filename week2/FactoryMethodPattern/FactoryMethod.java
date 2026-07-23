package week2.FactoryMethodPattern;

public class FactoryMethod {

    public static void main(String[] args) {

        Vehicle car = VehicleFactory.getVehicle("Car");
        car.start();

        Vehicle bike = VehicleFactory.getVehicle("Bike");
        bike.start();
    }
}

interface Vehicle {
    void start();
}

class Car implements Vehicle {

    @Override
    public void start() {
        System.out.println("Car Started.");
    }
}

class Bike implements Vehicle {

    @Override
    public void start() {
        System.out.println("Bike Started.");
    }
}

class VehicleFactory {

    public static Vehicle getVehicle(String type) {

        if (type.equalsIgnoreCase("Car")) {
            return new Car();
        } else if (type.equalsIgnoreCase("Bike")) {
            return new Bike();
        }

        return null;
    }
}