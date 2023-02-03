package unifySimilarClasses;

public class Red implements TrafficColor {

    private String color;

    public Red() {
        this.color = "red";
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
