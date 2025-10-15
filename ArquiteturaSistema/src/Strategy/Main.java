package Strategy;

public class Main {
    public static void main(String[] args) {
        MyList lista = new MyList();

        lista.insereFinal(3);
        lista.insereFinal(1);
        lista.insereFinal(14);
        lista.insereFinal(8);
        lista.insereFinal(12);
        lista.insereFinal(7);
        lista.insereFinal(2);

        MyList listaDesordenada = lista.copiarLista();

        lista.imprime();

        lista.sort();

        lista.imprime();

        System.out.println("-----");

        lista = listaDesordenada.copiarLista();

        lista.setSortStrategy(new ShellSortStrategy());

        lista.imprime();

        lista.sort();

        lista.imprime();

        System.out.println("-----");

        lista = listaDesordenada.copiarLista();

        lista.setSortStrategy(new HeapSortStrategy());

        lista = listaDesordenada.copiarLista();

        lista.imprime();

        lista.sort();

        lista.imprime();

    }
}