package counter;

public class Main {

    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            Counter counter = new Counter();
            incrementCounter(counter);
            System.out.println(counter.getCounter());
        }

    }


   static void incrementCounter(Counter counter){
        counter.increment();
    }

}
