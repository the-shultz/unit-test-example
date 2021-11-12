package mta.industry.skills.testing.unit.ioc.di;

import mta.industry.skills.testing.unit.ioc.di.api.Engine;
import mta.industry.skills.testing.unit.ioc.di.api.Vehicle;
import mta.industry.skills.testing.unit.ioc.di.api.Wheel;
import mta.industry.skills.testing.unit.ioc.di.impl.vehicle.Car;
import mta.industry.skills.testing.unit.ioc.di.impl.vehicle.CircusBicycle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

public class VehicleTest {

    @Test
    public void testCar() {

        // setup mocks
        Engine engineMock = Mockito.mock(Engine.class);

        Wheel wheelMock = Mockito.mock(Wheel.class);
        int mockedStabilityFactor = 7;
        Mockito.when(wheelMock.getStabilityFactor()).thenReturn(mockedStabilityFactor);
        List<Wheel> mockWheels = new ArrayList<>();
        mockWheels.add(wheelMock);
        mockWheels.add(wheelMock);

        // create concrete object with mocks
        Vehicle car = new Car(engineMock, mockWheels);

        // test object behavior (based on the mocks)
        Assertions.assertEquals(mockWheels.size(), car.getWheelsCount());

        double maximumAllowedWeight = car.getMaximumAllowedWeight();
        double expectedValue = mockedStabilityFactor * 1.5;
        Assertions.assertEquals(expectedValue ,maximumAllowedWeight);
    }

    @Test
    public void testBicycle() {
        Wheel wheelMock = Mockito.mock(Wheel.class);
        int mockedStabilityFactor = 4;
        Mockito.when(wheelMock.getStabilityFactor()).thenReturn(mockedStabilityFactor);

        Vehicle bicycle = new CircusBicycle(wheelMock, wheelMock);
        Assertions.assertEquals(2, bicycle.getWheelsCount());

        double maximumAllowedWeight = bicycle.getMaximumAllowedWeight();
        Assertions.assertEquals(mockedStabilityFactor * 2 ,maximumAllowedWeight);

    }
}
