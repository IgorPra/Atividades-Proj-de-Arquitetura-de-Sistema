package Strategy;

public class ShellSort {
    public static void sort(int[] list) {
        int n = list.length;

        for (int gap = n / 2; gap > 0; gap /= 2) {

            for (int i = gap; i < n; i++) {
                int temp = list[i];
                int j;

                for (j = i; j >= gap && list[j - gap] > temp; j -= gap) {
                    list[j] = list[j - gap]; // move o valor anterior
                }

                list[j] = temp;
            }
        }
    }
}
