package Sorting;
//quickSort Algorithm

public class QuickSort {
    public static int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; ++j) {
            if (arr[j] < pivot) {
                i++;
                // swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        i++;
        // swap pivot index
        int temp = arr[i];
        arr[i] = pivot;
        arr[high] = temp;
        // pivot index return
        return i;
    }

    public static void quickSort(int arr[], int low, int high) {
        if (low < high) {
            int pidx = partition(arr, low, high);

            quickSort(arr, low, pidx - 1);
            quickSort(arr, pidx + 1, high);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 9, 6, 3, 8, 5, 2, 7, 4, 1, 3, 6, 9, 2, 5, 8, 1, 4, 7 };
        int high = arr.length;
        int low = 0;

        quickSort(arr, low, high - 1);

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}


// Output => 1 1 2 2 3 3 4 4 5 5 6 6 7 7 8 8 9 9