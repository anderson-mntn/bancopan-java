package digitalinnovation;

public class ListaCircular <T> {
    private No<T> cabeca;
    private No<T> cauda;
    private int tamanhoLista;

    public ListaCircular(){
        this.cauda = null;
        this.cabeca = null;
        this.tamanhoLista = 0;
    }
    
    public boolean isEmpty(){
        return this.tamanhoLista == 0 ? true : false; //Se a lista é igual a zero, ela está vazia.
    }

    public int size(){
        return this.tamanhoLista;
    }

    public T get(int index){
        return this.getNo(index).getConteudo();
    }

    private No<T> getNo(int index){
        if(this.isEmpty()){
            throw new IndexOutOfBoundsException("A lista está vazia");
        }

        if(index == 0){
            return this.cauda;
        }

        No<T> noAuxiliar = this.cauda;
        for(int i = 0; (i < index) && (noAuxiliar!= null); i++){
            noAuxiliar = noAuxiliar.getNoProximo();
        }
        return noAuxiliar;
    }

    public void remove(int index){
        if(index >= this.tamanhoLista){
            throw new IndexOutOfBoundsException("indice maior que o tamanho da lista.");
        }
        No<T> noAuxiliar = this.cauda;
        if(index == 0){
            this.cauda = this.cauda.getNoProximo();
            this.cabeca.setNoProximo(this.cauda);
        } else if (index == 1){
            this.cauda.setNoProximo(this.cauda.getNoProximo().getNoProximo());
        } else {
            for(int i = 0 ; i < index - 1; i++){
                noAuxiliar = noAuxiliar.getNoProximo();
            }
            noAuxiliar.setNoProximo(noAuxiliar.getNoProximo().getNoProximo());   
        }
        this.tamanhoLista--;
    }

    public void add(T conteudo){
        No<T> novoNo = new No<>(conteudo);
        if(tamanhoLista == 0){
            this.cabeca = novoNo;
            this.cauda = this.cabeca;
            this.cabeca.setNoProximo(cauda);

        } else {
            novoNo.setNoProximo(this.cauda);
            this.cabeca.setNoProximo(novoNo);
            this.cabeca = novoNo;
        }
        this.tamanhoLista++;
    }

    @Override
    public String toString(){
        String strRetorno = "";
        No<T> noAuxiliar = this.cauda;
        for(int i = 0; i < this.size(); i++){
            noAuxiliar = noAuxiliar.getNoProximo(); 
            strRetorno += "[No{conteudo="+ noAuxiliar.getConteudo()+"}] --> ";
        }
        strRetorno += this.size() != 0 ? "(Retorna ao ínicio)" : "[]";
        return strRetorno;
    }


}