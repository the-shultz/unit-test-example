package mta.industry.skills.testing.unit.ioc.di.impl.wheel;

import mta.industry.skills.testing.unit.ioc.di.api.Wheel;

public class TerrainWheel implements Wheel {

    private int size;
    private int pressure;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getPressure() {
        return pressure;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    @Override
    public int getStabilityFactor() {
        return size * pressure * 2;
    }


    @Override
    public String toString() {
        return "RaceWheel{" +
                "size=" + size +
                ", pressure=" + pressure +
                '}';
    }
}
