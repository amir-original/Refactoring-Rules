package terraficLight;

public interface TrafficLightState {
    boolean isRed();
    boolean isYellow();
    boolean isGreen();

    void updateCar(Car car);
}
