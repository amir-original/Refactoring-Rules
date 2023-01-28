package terraficLight;

public class Red implements TerrificLightState2 {

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
