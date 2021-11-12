package mta.industry.skills.testing.unit.ioc.di.impl.container;

import mta.industry.skills.testing.unit.ioc.di.api.Engine;
import mta.industry.skills.testing.unit.ioc.di.api.Vehicle;
import mta.industry.skills.testing.unit.ioc.di.api.Wheel;
import mta.industry.skills.testing.unit.ioc.di.impl.engine.V8Engine;
import mta.industry.skills.testing.unit.ioc.di.impl.vehicle.Car;
import mta.industry.skills.testing.unit.ioc.di.impl.vehicle.CircusBicycle;
import mta.industry.skills.testing.unit.ioc.di.impl.wheel.RaceWheel;
import mta.industry.skills.testing.unit.ioc.di.impl.wheel.TerrainWheel;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Container {

    public static Vehicle getCar() {
        Engine v8 = new V8Engine(2000);
        List<Wheel> wheels = Stream.generate((RaceWheel::new))
                .peek(wheel -> {
                    wheel.setPressure(30);
                    wheel.setSize(40);
                })
                .limit(4)
                .collect(Collectors.toList());

        return new Car(v8, wheels, 2);
    }

    public static Vehicle getBicycle() {
        List<Wheel> wheels = new ArrayList<>();

        Wheel front = new TerrainWheel();
        front.setSize(60);
        front.setPressure(30);
        wheels.add(front);

        Wheel rear = new RaceWheel();
        rear.setSize(10);
        rear.setPressure(35);
        wheels.add(rear);

        return new CircusBicycle(front, rear);
    }

}
