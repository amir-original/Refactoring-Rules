package trafficLight;

public class Green implements TrafficLightState {

    public void updateCar(Car car) {
        car.drive();
    }
}
