package map;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class EstudoTreeMap {
    public static void main(String[] args) {
        TreeMap<String, String> treeCapitais = new TreeMap<>();

        treeCapitais.put("RS", "Porto Alegre");
        treeCapitais.put("SC", "Florianopolis");
        treeCapitais.put("PR", "Curitiba");
        treeCapitais.put("SP", "São Paulo");
        treeCapitais.put("RJ", "Rio de Janeiro");
        treeCapitais.put("MG", "Belo Horizonte");

        System.out.println(treeCapitais);


        System.out.println("topo da arvore: " + treeCapitais.firstKey());


        System.out.println("final da arvore" + treeCapitais.lastKey());

        System.out.println("Primeira Capital abaixo de SC: " + treeCapitais.lowerKey("SC"));
        System.out.println("Primeira Capital acima de SC: " + treeCapitais.higherKey("SC"));

        System.out.println(treeCapitais.firstEntry().getKey());
        System.out.println(treeCapitais);

        Map.Entry<String, String> firstEntry = treeCapitais.pollFirstEntry();
        Map.Entry<String, String> lastEntry =treeCapitais.pollLastEntry();

        //retorna a primeira capital no topo da arvore removendo do map
        System.out.println(firstEntry.getKey() + "-" + firstEntry.getValue());

        //retorna a primeira capital no final da arvore removendo do map
        System.out.println(lastEntry.getKey() + "-" + lastEntry.getValue());

        System.out.println(treeCapitais);

        //maneiras de percorrer

        Iterator<String> iterator = treeCapitais.keySet().iterator();

        while(iterator.hasNext()){
            String key = iterator.next();
            System.out.println(key + "-" + treeCapitais.get(key));
        }

        System.out.println("--------------");

        for(String capital : treeCapitais.keySet()){
            System.out.println(capital + "-" + treeCapitais.get(capital));
        }

        System.out.println("--------------");

        for(Map.Entry<String, String> capital: treeCapitais.entrySet()){
            System.out.println(capital.getKey() + "-" + capital.getValue());
        }


    }
}
