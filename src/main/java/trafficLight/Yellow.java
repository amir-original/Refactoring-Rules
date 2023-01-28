package trafficLight;

public class Yellow implements TrafficLightState {

    public void updateCar(Car car) {
        car.drive();
    }
}
