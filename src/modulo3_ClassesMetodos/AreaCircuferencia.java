package modulo3_ClassesMetodos;

public class AreaCircuferencia {

    double raio;
    static final double PI = 3.14;

    public AreaCircuferencia(double r) {

        raio = r;
    }

    double area() {
        return PI * Math.pow(raio, 2);
    }

    static double area(double raio) {
        return PI * Math.pow(raio, 2);
    }
}
