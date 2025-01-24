public class Fila <T extends Object>{
    private FilaBase cauda;
    private FilaBase cabeca;
    private int tamanho;

    public void enfileirar(T elemento){
        FilaBase t1 = new FilaBase<>();
        if(tamanho == 0){
            t1.elemento = elemento;
            this.cabeca = t1;
            this.cauda = t1;
        }else{
            
            t1.elemento = elemento;
            cauda.prox = t1;
            cauda = t1;
        }
        ++tamanho;
    }

    public T desenfileirar() throws Exception{
        if(tamanho == 0){
            throw new Exception("A fila está vazia");
        }
        T el = (T) cabeca.elemento;
        cabeca = (FilaBase) cabeca.prox;
        --tamanho;
        return el;
    }

    public int getTamanho(){
        return this.tamanho;
    }
}
