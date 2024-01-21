package modulo4;

public class SwitchWBreak {
    public static void main(String[] args) {

        String faixa = "roxa";

        switch (faixa.toLowerCase()){
            case "preta":
                System.out.println("To na preta, O que eu faço agora?");
                break;
            case "marrom":
                System.out.println("To quase na preta");
                break;
            case "roxa":
                System.out.println("Mais um pouco chego na marrom");
                break;
            case "azul":
                System.out.println("Sai da Branca GrazaDeus");
                break;
            case "branca":
                System.out.println("Preciso ir para azul logo");
                break;
            default:
                System.out.println("To começando agora");
                break;
        }
    }
}
