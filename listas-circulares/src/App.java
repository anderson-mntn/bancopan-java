import digitalinnovation.ListaCircular;

public class App {
    public static void main(String[] args) throws Exception {
        ListaCircular <String> minhaLista1 = new ListaCircular<>();
        minhaLista1.add("c0");
        minhaLista1.remove(0);
        minhaLista1.add("c1");
        minhaLista1.add("c2");
        minhaLista1.add("c3");
        minhaLista1.add("c4");
        
        System.out.println(minhaLista1);
        System.out.println(minhaLista1.get(0));
        System.out.println(minhaLista1.get(7)); //printa o ultimo independentemente de existir esse index na lista.
        
    }
}
