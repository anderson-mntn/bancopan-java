public class App {
    public static void main(String[] args) throws Exception {
        
        Fila minhaFila2 = new Fila();

        minhaFila2.enqueue(new No("primeiro nó"));
        minhaFila2.enqueue(new No("segundo nó"));
        minhaFila2.enqueue(new No("terceiro nó"));
        minhaFila2.enqueue(new No("quarto nó"));

        System.out.println(minhaFila2);

        System.out.println(minhaFila2.dequeue()); //tira da fila

        System.out.println(minhaFila2);

        minhaFila2.enqueue(new No("ultimo"));

        System.out.println(minhaFila2);

        System.out.println("current first: " + minhaFila2.first());
        
    }
}
