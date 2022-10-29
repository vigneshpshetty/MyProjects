package miniprojects;

class Plane{
    void takeOff(){
        System.out.println("P1ane is taking off");
    }
    void fly(){
        System.out.println("P1ane is flying");
    }
    void land(){
        System.out.println("P1ane is landing");
    }

}

class PassengerPlane extends Plane{

}

class CargoPlane extends  Plane{

}

class FighterPlane extends Plane{

}

/*
 * Building plane app using Inheritance
 * 
 */

public class Launch {
    public static void main(String[] args) {
        PassengerPlane pp = new PassengerPlane();
        CargoPlane cP   = new CargoPlane();
        FighterPlane fP = new FighterPlane();
        
        pp.takeOff();
        pp.fly();
        pp.land();
        System.out.println();

        cP.takeOff();
        cP.fly();
        cP.land();
        System.out.println();


        fP.takeOff();
        fP.fly();
        fP.land();
        System.out.println();
        
    }
}


/* Output 
P1ane is taking off
P1ane is flying
P1ane is landing

P1ane is taking off
P1ane is flying
P1ane is landing

P1ane is taking off
P1ane is flying
P1ane is landing
 */