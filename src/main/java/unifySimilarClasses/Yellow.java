package unifySimilarClasses;

public class Yellow implements TrafficColor {

    @Override
    public String color() {
        return "yellow";
    }

    @Override
    public void check(Car car) {
        car.stop();
    }
}
