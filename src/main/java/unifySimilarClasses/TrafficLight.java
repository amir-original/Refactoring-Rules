package unifySimilarClasses;

public class TrafficLight {

    public TrafficColor nextColor(TrafficColor t){
        if (t.color().equals("red")) return new Green();
        else if (t.color().equals("green")) return new Yellow();
        else if (t.color().equals("yellow")) return new Red();
        
        throw new IllegalArgumentException();
    }
}
