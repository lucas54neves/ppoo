public class TestePilha {
    public static void main(String[] args) {
        Pilha<String> lista = new Pilha<String>();
        lista.adicionar("Lucas");
        lista.adicionar("Yasmin");
        lista.adicionar("Dog");
        lista.adicionar("Filho");
        System.out.println(lista);
        lista.remover();
        System.out.println(lista);
        lista.remover();
        System.out.println(lista);
        System.out.println(lista.getObjeto(0));
        lista.remover();
        System.out.println(lista);
        lista.remover();
        System.out.println(lista);
    }
}
