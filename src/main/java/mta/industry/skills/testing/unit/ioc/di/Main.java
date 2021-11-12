package mta.industry.skills.testing.unit.ioc.di;

import mta.industry.skills.testing.unit.ioc.di.api.Vehicle;
import mta.industry.skills.testing.unit.ioc.di.impl.container.Container;

public class Main {

    public static void main(String[] args) {
        Vehicle car = Container.getCar();
        Vehicle circusBicycle = Container.getBicycle();

        System.out.println("Car: " + car);
        car.drive();
        System.out.println("==============");
        System.out.println("Circus bicycle: " + circusBicycle);
        circusBicycle.drive();
    }
}
