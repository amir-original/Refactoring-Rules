package arrayProccessor;

public class ArraySum {
    private final SumProcessor processor;

    public ArraySum(int accumulator) {
        this.processor = new SumProcessor(accumulator);
    }

    public int process(int[] arrays){

        for (int element : arrays) {
            processor.processElement(element);
        }

        return processor.getAccumulator();
    }

}
