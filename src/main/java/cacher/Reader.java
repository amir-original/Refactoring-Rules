package cacher;

public class Reader {

    private final String[] data;
    private int current = -1;

    public Reader(String[] data) {
        this.data = data;
    }

    public String readLine(){
        current++;

        return current < data.length ? data [current] : null;
    }
}
