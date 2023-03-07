package dio;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

import org.w3c.dom.stylesheets.LinkStyle;


public class Main {
    public static void main(String[] args) {

        //----------- hashCode -----------
        // List<Carro> listaCarros = new ArrayList<>();

        // listaCarros.add(new Carro("BMW"));
        // listaCarros.add(new Carro("FERRARI"));
        // listaCarros.add(new Carro("MERCEDEZ"));
        // listaCarros.add(new Carro("FORD"));

        // System.out.println(listaCarros);
        // System.out.println(new Carro("Ford").hashCode());
        
        //----------- Stack (Pilha) -----------

        Stack<Carro> stackCarros = new Stack <>();
        
        stackCarros.push(new Carro("Ford"));
        stackCarros.push(new Carro("Chevrolet"));
        stackCarros.push(new Carro("Fiat"));

        System.out.println(stackCarros);
        System.out.println(stackCarros.pop());
        System.out.println(stackCarros.peek());
        System.out.println(stackCarros.empty());

        // -------- Queue (Fila, LikedList) --------

        Queue<Carro> queueCarros = new LinkedList<>();
        queueCarros.add(new Carro("Ford"));
        queueCarros.add(new Carro("Fiat"));
        queueCarros.add(new Carro("Chevrolet"));

        System.out.println(queueCarros);
        System.out.println(queueCarros.offer(new Carro("Renault"))); //retorna false se não conseguir adicionar
        System.out.println(queueCarros.peek()); // primeiro da fila, se lista estiver vazia retorna null.
        System.out.println(queueCarros.poll()); // remove o primeiro
        System.out.println(queueCarros.size());

        // ---------- List (ArrayList) ---------

        List<Carro> listaCarros = new ArrayList<>();

        listaCarros.add(new Carro("BMW"));
        listaCarros.add(new Carro("FERRARI"));
        listaCarros.add(new Carro("MERCEDEZ"));
        listaCarros.add(new Carro("FORD"));

        System.out.println(listaCarros.contains(new Carro("FORD")));
        System.out.println(listaCarros.get(2)); // pega pelo index
        System.out.println(listaCarros.indexOf(new Carro("MERCEDEZ")));
        listaCarros.remove(2);
        System.out.println(listaCarros);



    }  
}
