package unifySimilarClasses;

public class Green implements TrafficColor {

    private final String color;

    public Green(String color) {
        this.color = color;
    }

    @Override
    public String color() {
        return this.color;
    }

    @Override
    public void check(Car car) {
        if (color().equals("green")) {
            car.drive();
        } else if (color().equals("red")) {
            car.stop();
        } else if (this.color().equals("yellow")) {
            car.stop();
        }

    }
}
