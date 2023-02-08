package arrayProccessor;

public class ArraySum {
    private int accumulator;

    public ArraySum(int accumulator) {
        this.accumulator = accumulator;
    }

    public int process(int[] arrays) {

        for (int element : arrays) {
                this.accumulator += element;
        }

        return accumulator;
    }
}
