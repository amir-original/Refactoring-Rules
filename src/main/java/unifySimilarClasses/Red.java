package unifySimilarClasses;

public class Red implements TrafficColor {

    @Override
    public String color() {
        return "red";
    }

    @Override
    public void check(Car car) {
        if (true) {
            car.stop();
        }
    }

}
