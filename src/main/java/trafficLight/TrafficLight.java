package trafficLight;

public class TrafficLight {
    private Car car;
    private static final TrafficLightState[] CYCLE = {TrafficLightState.RED, TrafficLightState.GREEN, TrafficLightState.YELLOW};

    public TrafficLight(Car car) {
        this.car = car;
    }

    public void updateCarForLight(TrafficLightState current){
        if (current.equals(TrafficLightState.RED))
            car.stop();
        else
            car.drive();
    }
}
