package arrayProccessor;

public class ArrayMinimum {
    private final MinimumProcessor processor;

    public ArrayMinimum(int accumulator) {
        this.processor = new MinimumProcessor(accumulator);
    }

    public int process(int[] arrays) {

        for (int element : arrays) {
            processor.processElement(element);
        }

        return processor.getAccumulator();
    }

}
