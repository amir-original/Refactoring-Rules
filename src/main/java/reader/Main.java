package reader;

public class Main {

    public static void main(String[] args) {
        String[] data = new String[]{"Hello", "Hi", "Salam"};
        final Reader br = new Reader(data);
        String line;

        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }

    }
}
