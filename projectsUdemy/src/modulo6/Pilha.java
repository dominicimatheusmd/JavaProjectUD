package modulo6;


import java.util.ArrayDeque;
import java.util.Deque;

//Last in - First out (LIFO)
public class Pilha {
    public static void main(String[] args) {
        Deque<String> livros = new ArrayDeque<>();

        livros.add("O pequeno principe");
        livros.push("Armas da persuasão");
        livros.push("O Hobbit");

        //Peek e Element -> obter o elmento mais recente da pilha (sem remover)
        //Diferença é o comportamento de resposta
        System.out.println(livros.peek()); //retorna null se a fila estiver vazia
        System.out.println(livros.element()); //retorna noSuchElementeException se a fila estiver vazia

        //Poll, remove e pop retorna o elemento mais recente da pilha e o remove
        //Diferença é o comportamento de resposta
        System.out.println(livros.poll()); //retorna false
        System.out.println(livros.remove()); //lança uma exceção
        System.out.println(livros.pop()); //lança uma exceção

    }
}
