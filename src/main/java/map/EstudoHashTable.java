package map;

import java.util.Hashtable;
import java.util.Map;

public class EstudoHashTable {
    public static void main(String[] args) {
        Hashtable<String, Integer> estudantes = new Hashtable<>();
//a diferença do hashtable para o hashMap é que o hashTable pode ser utilizado em ambientes onde se tem concorrencia de threds, compartilhando dados entre as threds
        estudantes.put("Lais", 15);
        estudantes.put("Maria",45);
        estudantes.put("Lucia", 87);

        System.out.println(estudantes);

        estudantes.put("Lucas" ,25);

        //possui basicamente os mesmos metodos do Hashmap

        estudantes.remove("Lucia");
        System.out.println(estudantes);
        System.out.println("Tamanho: " + estudantes.size());

        for(Map.Entry<String, Integer> entry : estudantes.entrySet()){
            System.out.println(entry.getKey() + "--" + entry.getValue());
        }
    }
}
