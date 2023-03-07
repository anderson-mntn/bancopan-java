package dio;

public class ArvoreBinaria<T extends Comparable<T>> {
    private BinNo<T> raiz;
    
    public ArvoreBinaria(){
        this.raiz = null;
    }

    public void inserir(T conteudo){
        BinNo<T> novoNo = new BinNo<>(conteudo);
        raiz = inserir(raiz, novoNo);
    }

    private BinNo<T> inserir(BinNo<T> atual, BinNo<T> novoNo){
        if(atual == null){
            return novoNo;
        } else if (novoNo.getConteudo().compareTo(atual.getConteudo()) < 0){
            atual.setLeftNo(inserir(atual.getLeftNo(), novoNo));
        } else { 
            atual.setRightNo(inserir(atual.getRightNo(), novoNo));
        }
        return atual;
    }

    public void exibirInOrder(){
        System.out.print("\n Exibindo IN-ORDER: ");
        exibirInOrder(this.raiz);
    }

    private void exibirInOrder(BinNo<T> atual){
        if(atual != null){
            exibirInOrder(atual.getLeftNo());
            System.out.print(atual.getConteudo() + ", ");
            exibirInOrder(atual.getRightNo());
        } 
    }

    public void exibirPosOrder(){
        System.out.print("\n Exibindo POS-ORDER: ");
        exibirPosOrder(this.raiz);
    }

    private void exibirPosOrder(BinNo<T> atual){
        if(atual != null){
            exibirPosOrder(atual.getLeftNo());
            exibirPosOrder(atual.getRightNo());
            System.out.print(atual.getConteudo() + ", ");
        } 
    }

    public void exibirPreOrder(){
        System.out.print("\n Exibindo PRE-ORDER: ");
        exibirPreOrder(this.raiz);
    }

    private void exibirPreOrder(BinNo<T> atual){
        if(atual != null){
            System.out.print(atual.getConteudo() + ", ");
            exibirPreOrder(atual.getLeftNo());
            exibirPreOrder(atual.getRightNo());
        } 
    }

    public void remover(T conteudo){
        try {
            BinNo<T> atual = this.raiz;
            BinNo<T> pai = null;
            BinNo<T> filho = null;
            BinNo<T> temp = null;

            while(atual != null && !atual.getConteudo().equals(conteudo)){
                pai = atual;
                if(conteudo.compareTo(atual.getConteudo()) < 0){
                    atual = atual.getLeftNo();
                } else {
                    atual = atual.getRightNo();
                }
            }

            if(atual == null){
                System.out.println("Conteudo nao encontrado - Bloco try.");
            }

            if(pai == null){
                if(atual.getRightNo() == null){
                    this.raiz = atual.getLeftNo();
                } else if(atual.getLeftNo() == null){
                    this.raiz = atual.getRightNo();
                } else {
                    for(temp = atual, filho = atual.getLeftNo();
                    filho.getRightNo() != null;
                    temp = filho, filho = filho.getLeftNo()){
                        if(filho != atual.getLeftNo()){
                            temp.setRightNo(filho.getLeftNo());
                            filho.setLeftNo(raiz.getLeftNo());
                        }
                    }
                    filho.setRightNo(raiz.getRightNo());
                    raiz = filho;
                }
            } else if(atual.getRightNo() == null){
                if(pai.getLeftNo() == atual){
                    pai.setLeftNo(atual.getLeftNo());
                } else {
                    pai.setRightNo(atual.getLeftNo());
                }
            } else if (atual.getLeftNo() == null){
                if(pai.getLeftNo() == atual){
                    pai.setLeftNo(atual.getRightNo());
                } else {
                    pai.setRightNo(atual.getRightNo());
                }
            } else {
                for(
                    temp = atual, filho = atual.getLeftNo();
                    filho.getRightNo() != null;
                    temp = filho, filho = filho.getRightNo()
                ){
                    if(filho!= atual.getLeftNo()){
                        temp.setRightNo(filho.getLeftNo());
                        filho.setLeftNo(atual.getLeftNo());
                    }
                    filho.setRightNo(atual.getRightNo());
                    if(pai.getLeftNo()== atual){
                        pai.setLeftNo(filho);
                    } else {
                        pai.setRightNo(filho);
                    }
                }
            }

        } catch (NullPointerException error) {
            System.out.println("Conteudo nao encontrado - Bloco catch.");
        }
    }
}
