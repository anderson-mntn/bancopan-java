package dio;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        Set<Carro> hashSetCarros = new HashSet<>();

        hashSetCarros.add(new Carro("Ford"));
        hashSetCarros.add(new Carro("Fiat"));
        hashSetCarros.add(new Carro("Peugeot"));
        hashSetCarros.add(new Carro("Porsche"));
        hashSetCarros.add(new Carro("Alfa Romeo"));

        System.out.println(hashSetCarros); // Set nao preserva ordem de inserção

        Set<Carro> treeSetCarros = new TreeSet<>();

        treeSetCarros.add(new Carro("Ford"));
        treeSetCarros.add(new Carro("Alfa Romeo"));
        treeSetCarros.add(new Carro("Fiat"));
        treeSetCarros.add(new Carro("Peugeot"));
        treeSetCarros.add(new Carro("Porsche"));
        treeSetCarros.add(new Carro("Zip"));

        System.out.println(treeSetCarros); // Vai dar erro, precisamos implementar comparable na class Carro
    }  
}
