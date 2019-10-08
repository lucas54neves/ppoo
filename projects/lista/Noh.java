 public class Noh <T> {
     private T objeto;
     private Noh<T> proximo;

     public Noh(T objeto) {
         this.objeto = objeto;
         this.proximo = null;
     }

     public T getObjeto() {
         return objeto;
     }

     public Noh<T> getProximo() {
         return proximo;
     }

     public void setProximo(Noh<T> novoProximo) {
         this.proximo = novoProximo;
     }
 }
