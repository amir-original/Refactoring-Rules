package terraficLight;

public class Car {

    private boolean isDrive;

    public void stop() {
        isDrive = false;
    }

    public void drive() {
        isDrive = true;
    }

    public boolean isDrive() {
        return isDrive;
    }
}
