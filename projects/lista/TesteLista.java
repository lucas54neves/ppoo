public class TesteLista {
    public static void main(String[] args) {
        Lista<String> lista = new Lista<String>();
        lista.adicionar("Lucas");
        lista.adicionar("Yasmin");
        lista.adicionar("Dog");
        lista.adicionar("Filho");
        System.out.println(lista);
        lista.remover("Dog");
        System.out.println(lista);
        lista.remover("Filho");
        System.out.println(lista);
        System.out.println(lista.getObjeto(0));
        lista.remover(lista.getObjeto(0));
        System.out.println(lista);
        lista.remover(lista.getObjeto(0));
        System.out.println(lista);
    }
}
