package terraficLight;

public class Yellow implements TerrificLightState2 {
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
