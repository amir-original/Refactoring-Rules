package unifySimilarClasses;

public class Green implements TrafficColor {

    @Override
    public String color() {
        return "green";
    }

    @Override
    public void check(Car car) {
        car.drive();
    }
}
