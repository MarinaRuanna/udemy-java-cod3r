package modulo2_estruturasControle;

public class Continue1 {
    public static void main(String[] args) {

        System.out.println("exemplo 1:");

        for ( int i = 0 ; i < 10 ; i++) {
            if ( i % 2 == 1) {
                continue;
            }
            System.out.println(i);
        }

        System.out.println("exemplo 2:");

        for ( int i = 0 ; i < 10 ; i++) {
            if ( i == 5) continue;
            System.out.println(i);
        }
    }
}
