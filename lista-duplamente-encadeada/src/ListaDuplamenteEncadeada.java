public class ListaDuplamenteEncadeada <T> {
    private NoDuplo<T> primeiroNo;
    private NoDuplo<T> ultimoNo;

    private int tamanhoDaLista;

    public int size(){
        return this.tamanhoDaLista;
    }

    public ListaDuplamenteEncadeada(){
        this.primeiroNo = null;
        this.ultimoNo = null;
        this.tamanhoDaLista = 0;
    }
    
    private NoDuplo<T> getNo(int index){
        NoDuplo<T> noAuxiliar = primeiroNo;
        for(int i = 0; (i < index) && (noAuxiliar != null); i++){
            noAuxiliar = noAuxiliar.getNoProximo();
        }
        return noAuxiliar;
    }

    // método para pegar no pelo index passado como argumento
    public T get(int index){
        return this.getNo(index).getConteudo();
    }

    //add nó na lista
    public void add(T elemento){
        NoDuplo<T> novoNo = new NoDuplo<>(elemento) ;
        novoNo.setNoProximo(null);
        novoNo.setNoPrevio(ultimoNo);
        if(primeiroNo == null){
            primeiroNo = novoNo;
        }
        if(ultimoNo != null){
            ultimoNo.setNoProximo(novoNo);
        }
        ultimoNo = novoNo;
        tamanhoDaLista++;
    }

    public void add(int index, T elemento){
        NoDuplo<T> noAuxiliar = getNo(index);
        NoDuplo<T> novoNo = new NoDuplo<>(elemento);
        novoNo.setNoProximo(noAuxiliar);
        
        if(novoNo.getNoProximo() != null){
            novoNo.setNoPrevio(noAuxiliar.getNoPrevio());
            novoNo.getNoProximo().setNoPrevio(novoNo);
        } else {
            novoNo.setNoPrevio(ultimoNo);
            ultimoNo = novoNo;
        }
        
        if(index == 0){
            primeiroNo = novoNo;
        } else{
            novoNo.getNoPrevio().setNoProximo(novoNo);
        }   
        tamanhoDaLista++;
    }

    public void remove(int index){
        if(index == 0){
            primeiroNo = primeiroNo.getNoProximo();
            if(primeiroNo != null){
                primeiroNo.setNoPrevio(null); //jvm vai perceber que ref é null e vai excluir da memória
            }
        } else {
            NoDuplo<T> noAuxiliar = getNo(index); //ref pra manipular e desencadear/linkar partes soltas
            noAuxiliar.getNoPrevio().setNoProximo(noAuxiliar.getNoProximo());
            if(noAuxiliar != ultimoNo){
                noAuxiliar.getNoProximo().setNoPrevio(noAuxiliar.getNoPrevio());
            } else {
                ultimoNo = noAuxiliar;
            }
        }   
        this.tamanhoDaLista--;
    }

    @Override
    public String toString(){
        String strRetorno = "";
        NoDuplo<T> noAuxiliar = primeiroNo;

        for(int i = 0; i < size(); i++){
            strRetorno += "[No{conteudo="+ noAuxiliar.getConteudo() + "}] --> " ;
            noAuxiliar = noAuxiliar.getNoProximo();
        }
        strRetorno += "null";
        return strRetorno;
    }

}
