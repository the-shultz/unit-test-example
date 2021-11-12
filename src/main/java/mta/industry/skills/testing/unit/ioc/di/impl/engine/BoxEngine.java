package mta.industry.skills.testing.unit.ioc.di.impl.engine;

public class BoxEngine {
    private int volume;
    private int cylinder;

    public BoxEngine(int volume, int cylinder) {
        this.volume = volume;
        this.cylinder = cylinder;
    }

    public int getVolume() {
        return volume;
    }

    public int getCylinder() {
        return cylinder;
    }

    @Override
    public String toString() {
        return "V8Engine{" +
                "volume=" + volume +
                ", cylinder=" + cylinder +
                '}';
    }
}
