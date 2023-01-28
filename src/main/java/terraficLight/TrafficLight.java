package terraficLight;

public class TrafficLight {
    private final Car car;
    private static final TerrificLightState2[] CYCLE = {new Red(), new Green(), new Yellow()};

    public TrafficLight(Car car) {
        this.car = car;
    }

    public void updateCareForLight(TerrificLightState2 current){
        if (current.isRed())
            car.stop();
        else
            car.drive();
    }
}
