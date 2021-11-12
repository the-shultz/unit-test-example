package mta.industry.skills.testing.unit.ioc.di.impl.vehicle;

import mta.industry.skills.testing.unit.ioc.di.api.Vehicle;
import mta.industry.skills.testing.unit.ioc.di.api.Wheel;

import java.util.ArrayList;
import java.util.List;

public class CircusBicycle implements Vehicle {

    private List<Wheel> wheels;

    public CircusBicycle(Wheel front, Wheel rear) {
        this.wheels = new ArrayList<>();
        wheels.add(front);
        wheels.add(rear);
    }

    @Override
    public void drive() {
        System.out.println("Driving my bicycle ! Yey !!");
    }

    @Override
    public int getWheelsCount() {
        return 2;
    }

    @Override
    public double getMaximumAllowedWeight() {
        return wheels.get(1).getStabilityFactor() * 2;
    }

    @Override
    public String toString() {
        return "CircusBicycle{" +
                "wheels=" + wheels +
                '}';
    }
}
