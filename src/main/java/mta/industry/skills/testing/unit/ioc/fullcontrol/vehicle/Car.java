package mta.industry.skills.testing.unit.ioc.fullcontrol.vehicle;


import mta.industry.skills.testing.unit.ioc.fullcontrol.component.Engine;
import mta.industry.skills.testing.unit.ioc.fullcontrol.component.Wheel;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Car implements Vehicle{

    private Engine engine;
    private List<Wheel> wheels;

    public Car() {
        this.engine = new Engine();
        this.wheels = Stream.generate((Wheel::new))
                .peek(wheel -> {
                    wheel.setPressure(30);
                    wheel.setSize(40);
                })
                .limit(4)
                .collect(Collectors.toList());

/*
        // this is the equivalent code...
        this.wheels = new ArrayList<>();
        for (int i=0; i<4; i++) {
            Wheel wheel = new Wheel();
            wheel.setPressure(30);
            wheel.setSize(40);
            this.wheels.add(wheel);
        }
*/
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
        return stabilityFactor * 1.5;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", wheels=" + wheels +
                '}';
    }
}
