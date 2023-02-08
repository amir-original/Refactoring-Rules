package arrayProccessor;

public class SumProcessor {

    private int accumulator;

    public SumProcessor(int accumulator) {

        this.accumulator = accumulator;
    }

    void processElement(int element) {
        accumulator += element;
    }

    public int getAccumulator() {
        return accumulator;
    }
}
