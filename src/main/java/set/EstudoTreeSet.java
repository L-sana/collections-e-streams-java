package set;

import java.util.Iterator;
import java.util.TreeSet;

public class EstudoTreeSet {
    public static void main(String[] args) {
        //arvore

        TreeSet<String> treeCapitais = new TreeSet<>();

        treeCapitais.add("Porto Alegre");
        treeCapitais.add("Florianopolis");
        treeCapitais.add("Curitiba");
        treeCapitais.add("São Paulo");
        treeCapitais.add("Rio de Janeiro");
        treeCapitais.add("Belo Horizonte");

        System.out.println(treeCapitais);

        System.out.println(treeCapitais.first()); // retorna elemento topo da arvore
        System.out.println(treeCapitais.last()); // retorna elemento final da arvore
        System.out.println(treeCapitais.lower("Curitiba")); //retorna elemento abaixo do elemento passado por parametro
        System.out.println(treeCapitais.higher("Belo Horizonte")); // retorna elemento acima do elemento passado por parametro

        System.out.println(treeCapitais);

        Iterator<String> iterator = treeCapitais.iterator();

        while (iterator.hasNext()){
            iterator.next();
        }




    }
}
