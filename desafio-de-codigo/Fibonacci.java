public class Fibonacci {
    public static void main(String[] args) {

        int N = 10;
        int proximo = 0, anterior = 0, atual = 1;
 
        // Iterate till proximo is N
        while (proximo < N) {
 
            // Print the number
            System.out.print(anterior + " "); // 0 ; 1 ; 1 ; 2 ;
 
            // Swap
            int acc = atual + anterior; // 1 ; 2 ; 3 ; 5
            anterior = atual; // 1 ; 1 ; 2 ; 3
            atual = acc; // 1 ; 2 ; 3 ;
            proximo = proximo + 1; // 1 ; 2 ; 3 ; 
        }
             
        
    }
}
