package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class DesafioFinalAulaList {
    public static void main(String[] args) {

        List<String> listaNomes = new ArrayList<>();

        listaNomes.add("Juliana");
        listaNomes.add("Pedro");
        listaNomes.add("Carlos");
        listaNomes.add("Larissa");
        listaNomes.add("João");

        Iterator<String> iterator = listaNomes.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());

        }

        listaNomes.set(2, "Roberto");
        System.out.println(listaNomes);

        listaNomes.remove(4);

        System.out.println(listaNomes);

        System.out.println(listaNomes.size());
        System.out.println(listaNomes.contains("Juliano") == false ? "Não contem Juliano na Lista" : "Contem Juliano na Lista" );

        List<String> novaLista = new ArrayList<>();

        novaLista.add("Ismael");
        novaLista.add("Rodrigo");

        listaNomes.addAll(novaLista);


        System.out.println(listaNomes);
        Collections.sort(listaNomes);
        System.out.println(listaNomes);

        System.out.println(listaNomes.isEmpty() == true ? "Lista está vazia" : "Lista não esta vazia");
    }
 }
