package Sorting;

public class InsertionSort {
    public static void insertionSort(int arr[]) {
        for (int i = 1; i < arr.length; ++i) {
            int current = arr[i];
            int j = i - 1;
            while (j >= 0 && current < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 3, 6, 9, 2, 5, 8, 1, 4, 7, 9, 6, 3, 8, 5, 2, 7, 4, 1 };

        insertionSort(arr);

        for (int x : arr)
            System.out.print(x + " ");
    }
}

// Output => 1 1 2 2 3 3 4 4 5 5 6 6 7 7 8 8 9 9
