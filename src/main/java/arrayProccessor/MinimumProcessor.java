package arrayProccessor;

public class MinimumProcessor implements ElementProcessor {

    private int accumulator;

    public MinimumProcessor(int accumulator) {

        this.accumulator = accumulator;
    }

    public void processElement(int element) {
        if (accumulator > element)
            accumulator = element;
    }

    public int getAccumulator() {
        return accumulator;
    }
}
