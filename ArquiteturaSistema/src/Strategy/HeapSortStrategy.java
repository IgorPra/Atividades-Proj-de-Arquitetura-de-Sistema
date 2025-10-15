package Strategy;

public class HeapSortStrategy extends SortStrategy {
    public void sort(MyList lista) {
        System.out.println("Heap Sort");
        HeapSort.sort(lista.getLista());
    }
}
