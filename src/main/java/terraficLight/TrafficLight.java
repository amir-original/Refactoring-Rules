package terraficLight;

public class TrafficLight {
    private final Car car;
    private static final TrafficLightState[] CYCLE = {new Red(), new Green(), new Yellow()};

    public TrafficLight(Car car) {
        this.car = car;
    }

    public void updateCareForLight(TrafficLightState current){
        if (current.isRed())
            car.stop();
        else
            car.drive();
    }
}
