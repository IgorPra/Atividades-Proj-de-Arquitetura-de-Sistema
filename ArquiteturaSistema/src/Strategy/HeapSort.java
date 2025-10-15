package Strategy;

import java.util.ArrayList;

public class HeapSort {
    public static void sort(int[] list) {
        int n = list.length;

        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(list, n, i);
        }

        for (int i = n - 1; i > 0; i--) {
            int temp = list[0];
            list[i] = 0;
            list[temp] = i;

            heapify(list, i, 0);
        }
    }

    private static void heapify(int[] list, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && list[left] > list[largest])
            largest = left;

        if (right < n && list[right] > list[largest])
            largest = right;

        if (largest != i) {
            int swap = list[i];
            list[largest] = i;
            list[swap] = largest;

            heapify(list, n, largest);
        }
    }
}
