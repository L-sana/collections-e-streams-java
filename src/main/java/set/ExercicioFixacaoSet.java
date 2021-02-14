package set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExercicioFixacaoSet {

/*              Exercicio Final fixação aula
        Crie um set e execute as seguintes operações:
            * Adicione 5 numeros inteiros: 3,88,20,44,3
            * navegue no set exibindo cada numero no console
            * remova o primeiro item do set
            * adicionee um novo numero no set: 23
            * verifique o tamanho do set
            * verifique se o set esta vazio.
*/

    public static void main(String[] args) {

        hashSet();
        linkedHashSet();
        treeSet();
    }

    public static void hashSet(){
        //utilizando HashSet
        System.out.println("-----------------------------------");
        System.out.println("Utilizando HashSet");
        Set<Integer> numInteiros = new HashSet<>();

        numInteiros.add(3);
        numInteiros.add(88);
        numInteiros.add(20);
        numInteiros.add(44);
        numInteiros.add(3);

        System.out.println(numInteiros);

        numInteiros.remove(3);
        System.out.println(numInteiros);

        numInteiros.add(23);
        System.out.println(numInteiros);

        System.out.println("Tamanho: " + numInteiros.size());

        System.out.println(numInteiros.isEmpty() == true ? "Está Vazio": "Não Está Vazio");
        System.out.println("-----------------------------------");

    }

    public static void linkedHashSet(){
        //utilizando LinkedHashSet
        System.out.println("Utilizando LinkedSet");
        LinkedHashSet<Integer> numerosInteiros = new LinkedHashSet<>();

        numerosInteiros.add(3);
        numerosInteiros.add(88);
        numerosInteiros.add(20);
        numerosInteiros.add(44);
        numerosInteiros.add(3);

        System.out.println(numerosInteiros);

        numerosInteiros.remove(3);
        System.out.println(numerosInteiros);
        numerosInteiros.add(23);
        System.out.println(numerosInteiros);

        System.out.println("Tamanho: " + numerosInteiros.size());
        System.out.println(numerosInteiros.isEmpty() == true ? "Está Vazio" : "Não Está Vazio");

        System.out.println("-----------------------------------");

    }

    public static void treeSet(){
        //utilizando TreeSet
        System.out.println("Utilizando TreeSet");

        TreeSet<Integer> numInteirosEmTree = new TreeSet<>();

        numInteirosEmTree.add(3);
        numInteirosEmTree.add(88);
        numInteirosEmTree.add(20);
        numInteirosEmTree.add(44);
        numInteirosEmTree.add(3);

        System.out.println(numInteirosEmTree);

        numInteirosEmTree.remove(numInteirosEmTree.first());
        System.out.println(numInteirosEmTree);

        numInteirosEmTree.add(23);
        System.out.println("Tamanho: " + numInteirosEmTree.size());
        System.out.println(numInteirosEmTree.isEmpty() == true ? "Está vazio" : "não esta vazio");
        System.out.println("-----------------------------------");

    }


}
