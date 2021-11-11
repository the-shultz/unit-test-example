package mta.industry.skills.testing.unit.ioc.fullcontrol;

import mta.industry.skills.testing.unit.ioc.fullcontrol.vehicle.Car;
import mta.industry.skills.testing.unit.ioc.fullcontrol.vehicle.CircusBicycle;
import mta.industry.skills.testing.unit.ioc.fullcontrol.vehicle.Vehicle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VehicleTest {

    @Test
    public void testCar() {
        Vehicle car = new Car();
        Assertions.assertEquals(4, car.getWheelsCount());

        double maximumAllowedWeight = car.getMaximumAllowedWeight();
        Assertions.assertEquals(15 /* ??? */ ,maximumAllowedWeight);
    }

    @Test
    public void testBicycle() {
        Vehicle bicycle = new CircusBicycle();
        Assertions.assertEquals(2, bicycle.getWheelsCount());

        double maximumAllowedWeight = bicycle.getMaximumAllowedWeight();
        Assertions.assertEquals(12 /* ??? */ ,maximumAllowedWeight);

    }
}
