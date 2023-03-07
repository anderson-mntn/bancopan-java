package dio;

public class BinNo<T extends Comparable<T>>{
    private T conteudo;
    private BinNo<T> leftNo;
    private BinNo<T> rightNo;

    public BinNo(T conteudo){
        this.conteudo = conteudo;
        leftNo = rightNo = null;
    }

    public BinNo() {
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public BinNo<T> getLeftNo() {
        return leftNo;
    }

    public void setLeftNo(BinNo<T> leftNo) {
        this.leftNo = leftNo;
    }

    public BinNo<T> getRightNo() {
        return rightNo;
    }

    public void setRightNo(BinNo<T> rightNo) {
        this.rightNo = rightNo;
    }

    @Override
    public String toString() {
        return "BinNo [conteudo=" + conteudo + "]";
    }

    
    
}