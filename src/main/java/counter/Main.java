package counter;

public class Main {

    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            Counter counter = new Counter();
            counter.increment();
            System.out.println(counter.getCounter());
        }

    }


}
