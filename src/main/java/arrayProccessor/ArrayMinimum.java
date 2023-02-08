package arrayProccessor;

public class ArrayMinimum {
    private int accumulator;

    public ArrayMinimum(int accumulator) {
        this.accumulator = accumulator;
    }

    public int process(int[] arrays) {

        for (int element : arrays) {
            processElement(element);
        }

        return accumulator;
    }

    private void processElement(int element) {
        if (accumulator > element)
            accumulator = element;
    }
}
