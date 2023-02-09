package arrayProccessor;

public class SumProcessor implements ElementProcessor {

    private int accumulator;

    public SumProcessor(int accumulator) {

        this.accumulator = accumulator;
    }

    public void processElement(int element) {
        accumulator += element;
    }

    public int getAccumulator() {
        return accumulator;
    }
}
