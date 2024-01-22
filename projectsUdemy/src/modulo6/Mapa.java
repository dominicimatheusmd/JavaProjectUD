package modulo6;

import jdk.jfr.consumer.RecordedThreadGroup;

import java.util.HashMap;
import java.util.Map;

public class Mapa {
    public static void main(String[] args) {

        //Map<K, V> onde K é key e V é Valor
        Map<Integer, String> usuarios = new HashMap<>();
        usuarios.put(1, "Miguel");
        usuarios.put(2, "Matheus");
        usuarios.put(55, "Carlos");
        usuarios.put(4, "Emanuelly");
        usuarios.put(5, "Caio");

        System.out.println(usuarios.size());

        System.out.println(usuarios.keySet());
        System.out.println(usuarios.values());
        System.out.println(usuarios.entrySet());
        System.out.println(usuarios.containsKey(5));

        System.out.println(usuarios.get(55));//Retorna o value atraves da Key


        //Percorre só pela chave
        for(int chave : usuarios.keySet()){
            System.out.println(chave);
        }

        //Percorre só pelo valor
        for(String valores : usuarios.values()){
            System.out.println(valores);
        }

        //Percorre pela chave e valor
        for(Map.Entry<Integer, String> registro : usuarios.entrySet()){
            System.out.println("ID:" + registro.getKey() + " NOME:" + registro.getValue());
        }

    }
}
