package modulo2_estruturasControle;

public class LoopFor1 {
    public static void main(String[] args) {

        // for(;;){}

        for (int i = 0; i <= 10; i+=2){
            System.out.printf("i = %d\n", i);
        }

        int x = 2;
        for (; x < 10;) {
            System.out.println("X = " + x);
            x++;
        }
    }
}
