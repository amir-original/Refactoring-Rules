package terraficLight;

public class Yellow implements TrafficLightState {
    @Override
    public boolean isRed() {
        return false;
    }

    @Override
    public boolean isYellow() {
        return true;
    }

    @Override
    public boolean isGreen() {
        return false;
    }
}
