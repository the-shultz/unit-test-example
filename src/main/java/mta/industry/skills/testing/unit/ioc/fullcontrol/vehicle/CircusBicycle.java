package mta.industry.skills.testing.unit.ioc.fullcontrol.vehicle;

import mta.industry.skills.testing.unit.ioc.fullcontrol.component.Wheel;

import java.util.ArrayList;
import java.util.List;

public class CircusBicycle implements Vehicle{

    private List<Wheel> wheels;

    public CircusBicycle() {
        this.wheels = new ArrayList<>();

        Wheel front = new Wheel();
        front.setSize(60);
        front.setPressure(30);
        this.wheels.add(front);

        Wheel rear = new Wheel();
        rear.setSize(10);
        rear.setPressure(35);
        this.wheels.add(rear);
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
