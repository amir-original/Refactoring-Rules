package arrayProccessor;

public class MinimumProcessor {

    private int accumulator;

    public MinimumProcessor(int accumulator) {

        this.accumulator = accumulator;
    }

    void processElement(int element) {
        if (accumulator > element)
            accumulator = element;
    }

    public int getAccumulator() {
        return accumulator;
    }
}
