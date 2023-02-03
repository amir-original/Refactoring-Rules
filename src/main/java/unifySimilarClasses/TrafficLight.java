package unifySimilarClasses;

public class TrafficLight {

    public TrafficColor nextColor(TrafficColor t){
        if (t.color().equals("red")) return new Green("green");
        else if (t.color().equals("green")) return new Yellow("yellow");
        else if (t.color().equals("yellow")) return new Green("red");

        throw new IllegalArgumentException();
    }
}
