public class App {
    public static void main(String[] args) throws Exception {
        ListaDuplamenteEncadeada<String> lista1 = new ListaDuplamenteEncadeada<>();
        lista1.add("c1");
        lista1.add("c2");
        lista1.add("c3");
        lista1.add("c4");
        System.out.println(lista1);

        lista1.remove(2);
        System.out.println("c3 removed");
        System.out.println(lista1);
        lista1.add(0, "novo c1");
        System.out.println("novo c1");
        System.out.println(lista1);
        lista1.add(3, "novo c4");
        System.out.println(lista1);
        lista1.add("44");
        System.out.println(lista1);
        lista1.remove(2);
        lista1.add(2, "ex c1");
        System.out.println(lista1);
    }
}
