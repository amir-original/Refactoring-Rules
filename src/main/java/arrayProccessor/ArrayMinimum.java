package arrayProccessor;

public class ArrayMinimum {
    private int accumulator;

    public ArrayMinimum(int accumulator) {
        this.accumulator = accumulator;
    }

    public int process(int[] arrays){

        for (int element : arrays) {
            if (accumulator > element)
                accumulator =element;
        }

        return accumulator;
    }
}
