package mta.industry.skills.testing.unit.ioc.di.impl.vehicle;

import mta.industry.skills.testing.unit.ioc.di.api.Engine;
import mta.industry.skills.testing.unit.ioc.di.api.Vehicle;
import mta.industry.skills.testing.unit.ioc.di.api.Wheel;

import java.util.List;

public class Car implements Vehicle {

    private Engine engine;
    private List<Wheel> wheels;
    private final double weightFactor;
    public Car(Engine engine, List<Wheel> wheels, double weightFactor) {
        this.engine = engine;
        this.wheels = wheels;
        this.weightFactor = weightFactor;
    }

    public Engine getEngine() {
        return engine;
    }

    public List<Wheel> getWheels() {
        return wheels;
    }

    @Override
    public void drive() {
        System.out.println("Driving my super Car ! vruuumm vreuuuumm !");
    }

    @Override
    public int getWheelsCount() {
        return wheels.size();
    }

    @Override
    public double getMaximumAllowedWeight() {
        int stabilityFactor = this.wheels.get(0).getStabilityFactor();
        return stabilityFactor * weightFactor;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", wheels=" + wheels +
                '}';
    }
}
