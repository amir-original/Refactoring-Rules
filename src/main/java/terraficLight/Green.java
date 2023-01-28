package terraficLight;

public class Green implements TerrificLightState2 {

    @Override
    public boolean isRed() {
        return false;
    }

    @Override
    public boolean isYellow() {
        return false;
    }

    @Override
    public boolean isGreen() {
        return true;
    }
}
