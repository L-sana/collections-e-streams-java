package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class EstudoHashSet {
    public static void main(String[] args) {
        Set<Double> notasAlunos = new HashSet<>();

        notasAlunos.add(5.8);
        notasAlunos.add(4.8);
        notasAlunos.add(10.0);
        notasAlunos.add(5.8);
        notasAlunos.add(9.6);
        notasAlunos.add(5.1);

        System.out.println(notasAlunos); // nao garante a ordem da inserção dos elementos, nao exibe igual ao recuperar as informações da coleção

        notasAlunos.remove(5.8);
        System.out.println(notasAlunos);
        System.out.println(notasAlunos.size());

        Iterator<Double> iterator = notasAlunos.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
