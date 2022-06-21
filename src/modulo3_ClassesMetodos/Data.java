package modulo3_ClassesMetodos;

public class Data {

    int dia;
    int mes;
    int ano;

    public Data() {
        // dia = 1;
        // mes = 1;
        // ano = 1970;
        this(1, 1, 1970);
    }

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    String dataFormatada() {
        return String.format("%d/%d/%d",this.dia, this.mes, this.ano);
    }
    void imprimirDataFormatada () {
       System.out.printf("%d/%d/%d",this.dia, this.mes, this.ano);
    }
}
