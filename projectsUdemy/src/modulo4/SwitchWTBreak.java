package modulo4;

//Classe sobre Switch sem o Break

/**
 * Se não utilizarmos o Break, a condição irá percorrer todo o Switch
 * Isso fará com que ele imprima todas que estiverem abaixo da condição break, como um degrau
 * colocando o break após o termino do primeiro CASE ele apenas imprime a condição que bater
**/
public class SwitchWTBreak {
    public static void main(String[] args) {

        String faixa = "preta";

        switch (faixa.toLowerCase()){
        case "preta":
            System.out.println("To na preta, O que eu faço agora?");
        case "marrom":
            System.out.println("To quase na preta");
        case "roxa":
            System.out.println("Mais um pouco chego na marrom");
        case "azul":
            System.out.println("Sai da Branca GrazaDeus");
        case "branca":
            System.out.println("Preciso ir para azul logo");
        default:
            System.out.println("To começando agora");
        }
    }
}
