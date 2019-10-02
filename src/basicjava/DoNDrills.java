package basicjava;

public class DoNDrills {
    public static void main(String[] args) {
        for(int i = 0; i < 10; i++) {
            System.out.println("First print: " + i);
        }

        for(int i = 10; i >= 0; i--) {
            System.out.println("Second print: " + i);
        }

        for(int i = 1; i <= 256; i *= 2) {
            System.out.println("Third print: " + i);
        }

        for(int i = 1; i <= 256; i *= 2) {
            System.out.println("Fourth print: " + (i - 1));
        }
        //int count = 0;
        for(int i = 2; i <= 50; i += 2) {
            System.out.println("Fifth print: " + Math.sqrt(i - 1));
            //System.out.println(i);
            //count++;
        }
        //System.out.println(count);
    }
}
