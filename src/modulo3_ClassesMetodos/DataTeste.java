package modulo3_ClassesMetodos;

public class DataTeste {

    public static void main(String[] args) {
        Data d1 = new Data();
        Data d2 = new Data(20, 12,2021);

        System.out.println(d1.dataFormatada());
        d2.imprimirDataFormatada();
    }
}
