package miniprojects;

class Plane {
    public void takeOff() {
        System.out.println("Plane is taking off");
    }

    public void fly() {
        System.out.println("Plane is flying");
    }

    public void land() {
        System.out.println("plane is landing");
    }
}

/**
 * PassengerPlane
 *
 */
class PassengerPlane extends Plane {
    public void fly() {
        System.out.println("Passenger plane is flying at Medium altitude");
    }

    public void carryPassenger() {
        System.out.println("Passenger plane carries Passenger");
    }

}

/**
 * CargoPlane
 */
class CargoPlane extends Plane {

    public void fly() {
        System.out.println("Cargo Plane is flying at Lower altitude");
    }

    public void carryCargo() {
        System.out.println("Cargo Plane carries Cargo");
    }

}

/**
 * FighterPlane
 */
class FighterPlane extends Plane {
    public void fly() {
        System.out.println("Cargo Plane is flying at Lower altitude");
    }

    public void carryWeapons() {
        System.out.println("Cargo Plane carries Weapons");
    }

}

public class PlaneApp {
    public static void main(String[] args) {

        PassengerPlane passengerPlane = new PassengerPlane();
        FighterPlane fighterPlane = new FighterPlane();
        CargoPlane cargoPlane = new CargoPlane();

        passengerPlane.takeOff();
        passengerPlane.fly();
        passengerPlane.land();
        // passengerPlane.carryPassenger();
        passengerPlane.carryPassenger();
        System.out.println();

        cargoPlane.takeOff();
        cargoPlane.fly();
        cargoPlane.land();
        cargoPlane.carryCargo();
        System.out.println();

        fighterPlane.takeOff();
        fighterPlane.fly();
        fighterPlane.land();
        fighterPlane.carryWeapons();
        System.out.println();
    }
}


/* output

Plane is taking off
Passenger plane is flying at Medium altitude
plane is landing
Passenger plane carries Passenger

Plane is taking off
Cargo Plane is flying at Lower altitude
plane is landing
Cargo Plane carries Cargo

Plane is taking off
Cargo Plane is flying at Lower altitude
plane is landing
Cargo Plane carries Weapons

 */
