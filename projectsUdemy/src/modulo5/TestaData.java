package modulo5;

public class TestaData {

    public static void main(String[] args) {
        Data diaUm = new Data();
        diaUm.ano = 2024;

        var d2 = new Data(31, 12, 2020);

        System.out.println(diaUm.obterDataFormatada());
        System.out.println(d2.obterDataFormatada());

        diaUm.imprimeDataFormatada();
        d2.imprimeDataFormatada();
    }
}