package modulo6;

import java.util.ArrayList;


//First in - First out (FIFO)
public class Lista {
    public static void main(String[] args) {
        ArrayList<Usuario> lista = new ArrayList<Usuario>();

        lista.add(new Usuario("Carlos"));
        lista.add(new Usuario("Bia"));
        lista.add(new Usuario("Matheus"));

        //System.out.println(lista.get(1).nome);

        System.out.println(lista.remove(new Usuario("Bia")));

        System.out.println(lista.contains(new Usuario("Matheus")));

        for(Usuario u : lista){
            System.out.println(u.nome);
        }
    }
}
