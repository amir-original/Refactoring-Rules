package reader;

public class Reader {
    private final String[] data;
    private int current = -1;

    public Reader(String[] data) {
        this.data = data;
    }

    public String readLine() {
        this.current++;

        return current < data.length ? this.data[current] : null;
    }

}
