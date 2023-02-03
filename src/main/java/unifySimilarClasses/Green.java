package unifySimilarClasses;

public class Green implements TrafficColor {

    private String color;

    public Green() {
        this.color = "green";
    }

    @Override
    public String color() {
        return this.color;
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
