package unifySimilarClasses;

public class Green implements TrafficColor {

    @Override
    public String color() {
        return "green";
    }

    @Override
    public void check(Car car) {
        if (color().equals("green")){
            car.drive();
        }
        else if (color().equals("red")) {
            car.stop();
        }

    }
}
