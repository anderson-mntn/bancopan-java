public class App {
    public static void main(String[] args) throws Exception {

        Pilha minhaPilha1 = new Pilha();

        minhaPilha1.push(new No (1));
        minhaPilha1.push(new No (2));
        minhaPilha1.push(new No (3));
        minhaPilha1.push(new No (4));
        minhaPilha1.push(new No (5));
        
        System.out.println(minhaPilha1);
    }
}
