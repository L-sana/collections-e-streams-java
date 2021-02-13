package set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class EstudoLinkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet<Integer> sequenciaDeNumeros = new LinkedHashSet<>();

        sequenciaDeNumeros.add(5);
        sequenciaDeNumeros.add(7);
        sequenciaDeNumeros.add(9);
        sequenciaDeNumeros.add(9);
        sequenciaDeNumeros.add(14);

        System.out.println(sequenciaDeNumeros); //mantém a ordem da inserção dos elementos, nao exibe igual ao recuperar as informações da coleção
        sequenciaDeNumeros.remove(3);
        System.out.println(sequenciaDeNumeros);

        System.out.println(sequenciaDeNumeros.size());


        Iterator<Integer> iterator = sequenciaDeNumeros.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }
}
