package trafficLight;

public class Red implements TrafficLightState {

    public void updateCar(Car car) {
        car.stop();
    }
}
