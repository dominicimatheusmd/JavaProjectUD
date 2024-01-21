package modulo4;

//Continue irá interromper a execução daquela condição mas continuara a execução das demais
public class BreakWContinue {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++){
            if (i % 2 == 1){
                continue;
            }

            System.out.println(i);
        }
        System.out.println("Fim!");
    }
}
