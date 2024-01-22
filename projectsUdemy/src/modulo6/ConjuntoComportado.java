package modulo6;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {
    public static void main(String[] args) {
        Set<String> lista = new HashSet<String>();
        //SortedSet<String> lista = new TreeSet<>();

        lista.add("Carlos");
        lista.add("Lucas");
        lista.add("Matheus");

        for(String candidato : lista){
            System.out.println(candidato);
        }


    }
}
