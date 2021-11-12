package mta.industry.skills.testing.unit.ioc.di.impl.engine;

import mta.industry.skills.testing.unit.ioc.di.api.Engine;

public class V8Engine implements Engine {
    private int volume;
    private int cylinder;

    public V8Engine(int volume) {
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public int getCylinder() {
        return 8;
    }

    @Override
    public String toString() {
        return "V8Engine{" +
                "volume=" + volume +
                ", cylinder=" + cylinder +
                '}';
    }
}
