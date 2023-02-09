package arrayProccessor;

public class BatchProcessor {
    private final ElementProcessor processor;

    public BatchProcessor(ElementProcessor processor) {
        this.processor = processor;
    }

    public int process(int[] arrays){

        for (int element : arrays) {
            processor.processElement(element);
        }

        return processor.getAccumulator();
    }

}
