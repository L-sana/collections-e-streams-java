package map;

import java.util.HashMap;
import java.util.Map;

public class EstudoHashMap {
    public static void main(String[] args) {
        Map<String,Integer> campeoesMundialFifa = new HashMap<>();

        campeoesMundialFifa.put("Brasil", 5);
        campeoesMundialFifa.put("Alemanha", 4);
        campeoesMundialFifa.put("Italia", 4);
        campeoesMundialFifa.put("Uruguai", 2);

        System.out.println(campeoesMundialFifa);

        campeoesMundialFifa.put("Brasil", 6);
        System.out.println(campeoesMundialFifa);

        System.out.println(campeoesMundialFifa.get("Italia")); //retorna o value

        System.out.println(campeoesMundialFifa.containsKey("França"));
        System.out.println(campeoesMundialFifa.containsValue(6));

        System.out.println(campeoesMundialFifa.size());

        for(Map.Entry<String, Integer> entry : campeoesMundialFifa.entrySet()){
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }

        for (String key : campeoesMundialFifa.keySet()){ // mais performatica que o Entry
            System.out.println(key + "--" + campeoesMundialFifa.get(key));
        }
    }
}
