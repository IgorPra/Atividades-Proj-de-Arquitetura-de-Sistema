package Strategy;

public class QuickSortStrategy extends SortStrategy {
    public void sort(MyList lista) {
        System.out.println("Quick Sort");
        QuickSort.sort(lista.getLista());
    }
}
