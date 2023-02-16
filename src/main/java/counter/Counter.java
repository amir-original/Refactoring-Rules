package counter;

public class Counter {
    private int counter = 0;

    private int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public void increment(){
        counter++;
    }

    public void print(){
        System.out.println(counter);
    }
}
