package dio;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


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
    }  
}
