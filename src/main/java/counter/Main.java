package counter;

public class Main {

    public static void main(String[] args) {
        Counter counter = new Counter();
        for (int i = 0; i < 20; i++) {
            counter.increment();
            counter.print();
        }

    }


}
