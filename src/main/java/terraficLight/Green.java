package terraficLight;

public class Green implements TrafficLightState {

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

    public void updateCar(Car car) {
        car.drive();
    }
}
