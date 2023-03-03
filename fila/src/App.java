public class App {
    public static void main(String[] args) throws Exception {
        
        Fila<String> minhaFila2 = new Fila<String>();

        minhaFila2.enqueue("primeiro nó");
        minhaFila2.enqueue("segundo nó");
        minhaFila2.enqueue("terceiro nó");
        minhaFila2.enqueue("quarto nó");

        System.out.println(minhaFila2);

        System.out.println(minhaFila2.dequeue()); //tira da fila

        System.out.println(minhaFila2);

        minhaFila2.enqueue("ultimo");

        System.out.println(minhaFila2);

        System.out.println("current first: " + minhaFila2.first());
        
    }
}
