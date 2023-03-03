public class Fila <T>{

    private No<T> refNoEntradaFila;

    public Fila() {
        this.refNoEntradaFila = null;
    }

    public boolean isEmpty(){
        return refNoEntradaFila == null ? true : false;
    }
    
    public void enqueue(T object){
        No<T> novoNo = new No<T>(object);
        novoNo.setRefNo(refNoEntradaFila);
        refNoEntradaFila = novoNo;
    }

    // .first() vai retornar o primeiro nó da fila
    public T first(){  
        if(!this.isEmpty()){
            No<T> primeiroNo = refNoEntradaFila;
            while(true){
                if(primeiroNo.getRefNo() != null){
                   primeiroNo = primeiroNo.getRefNo();
                } else {
                    break;
                }
            } 
            return (T) primeiroNo.getObject();
        }
        return null;
    } 

    //dequeue - pegar o imediatamente anterior e apontar para null
    public T dequeue(){  
        if(!this.isEmpty()){
            No<T> primeiroNo = refNoEntradaFila;
            No<T> noAuxiliar = refNoEntradaFila;
            while(true){
                if(primeiroNo.getRefNo() != null){
                    noAuxiliar = primeiroNo;
                    primeiroNo = primeiroNo.getRefNo();
                } else {
                    noAuxiliar.setRefNo(null);
                    break;
                }
            } 
            return (T) primeiroNo.getObject();
        }
        return null;
    }

    @Override
    public String toString() {
        String stringRetorno = "";
        No<T> noAuxiliar = refNoEntradaFila;

        if(refNoEntradaFila != null){
            while(true){
                stringRetorno += "[No{objeto="+ noAuxiliar.getObject() + "}] --> ";
                noAuxiliar.getRefNo();
                if(noAuxiliar.getRefNo() != null){
                    noAuxiliar = noAuxiliar.getRefNo();
                } else {
                    stringRetorno += "null";
                    break;
                }
            }
        } else {
            stringRetorno += "null";
        }

        return (String) stringRetorno;
    } 

    
}
