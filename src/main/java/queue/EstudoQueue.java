package queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class EstudoQueue {

    public static void main(String[] args) {
        Queue<String> filaBanco = new LinkedList<>();
        filaBanco.add("Pamela");
        filaBanco.add("Patricia");
        filaBanco.add("Roberto");
        filaBanco.add("Flavio");
        filaBanco.add("Anderson");
        System.out.println(filaBanco);

        String clienteASerAtendido = filaBanco.poll(); //retorna o primeiro elemento da fila e o remove
        System.out.println(clienteASerAtendido);
        System.out.println(filaBanco);

//        filaBanco.clear();   // testando o uso dos metodos em fila vazia

        String primeiroCliente = filaBanco.peek(); //retorna o primeiro elemento da fila mas nao remove, em caso da fila vazia retorna null e a fila vazia
        System.out.println(primeiroCliente);

        System.out.println(filaBanco);

        String primeiroClienteErro = filaBanco.element(); // o element parecido com o peek retorna o primeiro elemento da fila sem remove-lo porem em caso de fila vazia estoura o erro de exception
        System.out.println(primeiroClienteErro);

        for (String cliente: filaBanco){
            System.out.println("-for->" + cliente);
        }

        System.out.println();

        Iterator<String> iteratorFilaBanco = filaBanco.iterator();
        while (iteratorFilaBanco.hasNext()){
            System.out.println("-iterator->" +iteratorFilaBanco.next());
        }




    }
}
