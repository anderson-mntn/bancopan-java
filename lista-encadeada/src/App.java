

public class App {
    public static void main(String[] args) throws Exception {
        
        ListaEncadeada <String> minhaListaEnc1 = new ListaEncadeada<>();

        minhaListaEnc1.add("primeiro index");
        minhaListaEnc1.add("segundo index");
        minhaListaEnc1.add("terceiro index");
        minhaListaEnc1.add("quarto index");
        

        System.out.println(minhaListaEnc1.get(0));
        System.out.println(minhaListaEnc1.get(1));
        System.out.println(minhaListaEnc1.get(2));
        System.out.println(minhaListaEnc1.get(3));

        System.out.println("????"+minhaListaEnc1.toStringHandmade());
        minhaListaEnc1.remove(2);
        System.out.println("||||" + minhaListaEnc1.toStringHandmade());
    }
}
