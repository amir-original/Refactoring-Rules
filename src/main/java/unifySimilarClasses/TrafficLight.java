package unifySimilarClasses;

public class TrafficLight {

    public TrafficColor nextColor(TrafficColor t){
        if (t.color().equals(ColorState.RED)) return new Color(ColorState.GREEN);
        else if (t.color().equals(ColorState.GREEN)) return new Color(ColorState.YELLOW);
        else if (t.color().equals(ColorState.YELLOW)) return new Color(ColorState.RED);

        throw new IllegalArgumentException();
    }
}
