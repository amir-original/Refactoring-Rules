package counter;

public class Main {

    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            incrementCounter();
            System.out.println(counter);
        }

    }

   static int counter = 0;
   static void incrementCounter(){
        counter++;
    }

}
