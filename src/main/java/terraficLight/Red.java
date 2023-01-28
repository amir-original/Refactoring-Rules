package terraficLight;

public class Red implements TrafficLightState {

    @Override
    public boolean isRed() {
        return true;
    }

    @Override
    public boolean isYellow() {
        return false;
    }

    @Override
    public boolean isGreen() {
        return false;
    }
}
