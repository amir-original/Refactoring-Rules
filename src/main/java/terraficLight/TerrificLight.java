package terraficLight;

public class TerrificLight {
    private Car car;
    private static final TerrificLightState[] CYCLE = {TerrificLightState.RED,TerrificLightState.GREEN,TerrificLightState.YELLOW};

    public TerrificLight(Car car) {
        this.car = car;
    }

    public void updateCareForLight(TerrificLightState current){
        if (current.equals(TerrificLightState.RED))
            car.stop();
        else
            car.drive();
    }
}
