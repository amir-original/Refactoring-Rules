package arrayProccessor;

public class ArraySum {
    private int accumulator;

    public ArraySum(int accumulator) {
        this.accumulator = accumulator;
    }

    public int process(int[] arrays){

        for (int element : arrays) {
            processElement(element);
        }

        return accumulator;
    }

    private void processElement(int element) {
        accumulator += element;
    }
}
