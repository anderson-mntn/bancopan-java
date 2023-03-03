
public class ListaEncadeada <T>{
    No<T> referenciaEntrada;

    public ListaEncadeada(){
        this.referenciaEntrada = null;
    }

    public void add(T conteudo){
        No <T> novoNo = new No<>(conteudo);
        if (this.isEmpty()) {
            referenciaEntrada = novoNo;
            return;
        }
        No<T> noAuxiliar = referenciaEntrada;
        for (int i = 0; i < this.size() -1; i++) {
            noAuxiliar = noAuxiliar.getProximoNo();
             
        }
        noAuxiliar.setProximoNo(novoNo);
    }

    public T get(int index){
        return getNo(index).getConteudo();
    }

    private No<T> getNo (int index){
        validarIndex(index);
        No<T> noAuxiliar = referenciaEntrada;
        No<T> noRetorno = null;
        for (int i = 0; i <= index; i++) {
            noRetorno = noAuxiliar;
            noAuxiliar =  noAuxiliar.getProximoNo();
        }
        return noRetorno;
    }

    public T remove(int index){  // Se passarmos 3 no parametro
        No<T> noPivor = this.getNo(index);  // Nó de index = 3
        if (index == 0) {
            referenciaEntrada = noPivor.getProximoNo();
            return noPivor.getConteudo();
        }
       
        No<T> noAnterior = getNo(index - 1);  // Nó de index = 2
        noAnterior.setProximoNo(noPivor.getProximoNo());
        return noPivor.getConteudo();
    }

    public int size(){
        int tamanhoLista = 0;
        No<T> referenciaAuxiliar = referenciaEntrada;
        while(true){
            if(referenciaAuxiliar != null){
                tamanhoLista++;
                if(referenciaAuxiliar.getProximoNo() != null){ //Verifica se existe algum nó a frente
                    referenciaAuxiliar = referenciaAuxiliar.getProximoNo();
                } else {
                    break;
                }
            } else {
                break;
            }
        }
        return tamanhoLista;
    }

    public boolean isEmpty(){
        return referenciaEntrada == null ? true : false;
    }  
    
    public void validarIndex(int index){
        int ultimoIndex = size() - 1;
        if (index >= size()) {
            throw new IndexOutOfBoundsException("Não existe conteudo no index: " + index +  " desta lista. Esta lista só vai até o index " + ultimoIndex + ".");        
        }
    }

    public String toStringHandmade(){
        String strRetorno = "";
        No<T> noAuxiliar = referenciaEntrada;
        for (int i = 0; i <= this.size() -1; i++) {
            strRetorno += "No{conteudo= " + noAuxiliar.getConteudo() + "} -> ";
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        strRetorno += "null";
        return strRetorno;
    }
}

