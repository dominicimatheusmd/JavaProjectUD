package modulo6;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();

        fila.add("Ana"); // Lança uma exceção caso a fila esteja cheia
        fila.offer("Bia"); // retorna false caso a fila esteja cheia

        fila.add("Matheus");
        fila.offer("Gui");
        fila.add("Carlos");
        fila.offer("Lucas");

        //Peek e Element -> obter o proximo elmento da fila (sem remover)
        //Diferença é o comportamento de resposta
        System.out.println(fila.peek()); //retorna null se a fila estiver vazia
        System.out.println(fila.element()); //retorna noSuchElementeException se a fila estiver vazia

        //fila.size();
        //fila.clear();
        //fila.isEmpty();

        //Poll e remover retorna o proximo elemento da fila e o remove
        //Diferença é o comportamento de resposta
        System.out.println(fila.poll()); //retorna false
        System.out.println(fila.remove()); //lança uma exceção
    }
}
