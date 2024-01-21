package modulo5;

//Classe sobre this e this()
public class Data {

    int dia;
    int mes;
    int ano;

    Data(){
        dia = 1;
        mes = 1;
        ano = 2024;
        //this(1, 1, 2014)
    }

    Data(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    String obterDataFormatada(){
        return String.format("%d/%d/%d", this.dia, this.mes, this.ano);
    }

    void imprimeDataFormatada(){
        System.out.println(obterDataFormatada());
    }

}
