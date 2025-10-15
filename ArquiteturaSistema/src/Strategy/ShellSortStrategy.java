package Strategy;

public class ShellSortStrategy extends  SortStrategy {
    public void sort(MyList lista) {
        System.out.println("Shell Sort");
        ShellSort.sort(lista.getLista());
    }
}
