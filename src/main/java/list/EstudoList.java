package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class EstudoList {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();


        nomes.add("Lais");
        nomes.add("Jão");
        nomes.add("Zuleide");
        nomes.add("Maria");
        nomes.add("Alberto");
        System.out.println(nomes);
        nomes.set(2, "Irma Zuleide");
        System.out.println(nomes);


        Collections.sort(nomes);
        System.out.println(nomes);

        int posicao = nomes.indexOf("Lais"); // se retorno == -1 é porque nao encontrou elemento na list
        System.out.println(posicao);

        nomes.remove("Irma Zuleide");
        nomes.remove(3);
        System.out.println(nomes);

        String nome = nomes.get(2);
        System.out.println(nome);

        int tamanhoArraylist = nomes.size();
        System.out.println(tamanhoArraylist);

        boolean contemLais = nomes.contains("Lais");
        System.out.println(contemLais);

        boolean listaVazia = nomes.isEmpty();
        System.out.println(listaVazia);

        for (String nomeDoItem: nomes){
            System.out.println("-for->" + nomeDoItem);
        }

        Iterator<String> iterator = nomes.iterator();

        while(iterator.hasNext()){
            System.out.println("-iterator->" + iterator.next());
        }

        nomes.clear();
        listaVazia = nomes.isEmpty();
        System.out.println(listaVazia);



    }
}
