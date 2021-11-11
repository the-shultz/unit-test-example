package mta.industry.skills.testing.unit.ioc.fullcontrol;


import mta.industry.skills.testing.unit.ioc.fullcontrol.vehicle.Car;
import mta.industry.skills.testing.unit.ioc.fullcontrol.vehicle.CircusBicycle;
import mta.industry.skills.testing.unit.ioc.fullcontrol.vehicle.Vehicle;

public class Main {
    public static void main(String[] args) {

        Vehicle car = new Car();
        Vehicle circusBicycle = new CircusBicycle();

        System.out.println("Car: " + car);
        car.drive();
        System.out.println("==============");
        System.out.println("Circus bicycle: " + circusBicycle);
        circusBicycle.drive();
        
    }
}
