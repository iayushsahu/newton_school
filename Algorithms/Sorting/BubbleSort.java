package Sorting;

public class BubbleSort {
    public static void bubbleSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; ++i) {
            for (int j = 0; j < arr.length - i - 1; ++j) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 3, 6, 9, 2, 5, 8, 1, 4, 7, 9, 6, 3, 8, 5, 2, 7, 4, 1 };

        bubbleSort(arr);

        for (int x : arr)
            System.out.print(x + " ");
    }
}

// Output => 1 1 2 2 3 3 4 4 5 5 6 6 7 7 8 8 9 9
