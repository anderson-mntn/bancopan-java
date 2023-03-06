public class NoDuplo <T> {
    private T conteudo;
    private NoDuplo<T> NoProximo; //Ref Nó Próximo;
    private NoDuplo<T> NoPrevio; //Ref Nó Anterior

    public NoDuplo(T conteudo){
        this.conteudo = conteudo;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public NoDuplo<T> getNoProximo() {
        return NoProximo;
    }

    public void setNoProximo(NoDuplo<T> noProximo) {
        NoProximo = noProximo;
    }

    public NoDuplo<T> getNoPrevio() {
        return NoPrevio;
    }

    public void setNoPrevio(NoDuplo<T> noPrevio) {
        NoPrevio = noPrevio;
    }

    @Override
    public String toString() {
        return "NoDuplo [conteudo=" + conteudo + "]";
    }

    

}
