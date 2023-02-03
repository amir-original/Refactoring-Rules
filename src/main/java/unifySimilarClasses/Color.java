package unifySimilarClasses;

public class Color implements TrafficColor {

    private final ColorState color;

    public Color(ColorState color) {
        this.color = color;
    }

    @Override
    public ColorState color() {
        return this.color;
    }

    @Override
    public void check(Car car) {
        if (color().equals(ColorState.GREEN)) {
            car.drive();
        } else if (color().equals(ColorState.RED)) {
            car.stop();
        } else if (this.color().equals(ColorState.YELLOW)) {
            car.stop();
        }

    }
}
