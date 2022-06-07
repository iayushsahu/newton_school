package Sorting;

public class MergeSort {
    public static void conqure(int arr[], int start, int mid, int end) {
        int merged[] = new int[end - start + 1];

        int idx1 = start;
        int idx2 = mid + 1;
        int x = 0;

        while (idx1 <= mid && idx2 <= end) {
            if (arr[idx1] <= arr[idx2]) {
                merged[x++] = arr[idx1++];
            } else {
                merged[x++] = arr[idx2++];
            }
        }

        while (idx1 <= mid) {
            merged[x++] = arr[idx1++];
        }

        while (idx2 <= end) {
            merged[x++] = arr[idx2++];
        }

        for (int i = 0, j = start; i < merged.length; ++i, ++j) {
            arr[j] = merged[i];
        }
    }

    public static int[] implementMergeSort(int arr[], int start, int end) {
        if (start >= end) {
            return arr;
        }

        int mid = start + (end - start) / 2;

        implementMergeSort(arr, start, mid);
        implementMergeSort(arr, mid + 1, end);
        conqure(arr, start, mid, end);
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 6, 9, 2, 5, 8, 1, 4, 7, 9, 6, 3, 8, 5, 2, 7, 4, 1 };

        implementMergeSort(arr, 0, arr.length - 1);

        for (int x : arr)
            System.out.print(x + " ");
    }
}

// Output => 1 1 2 2 3 3 4 4 5 5 6 6 7 7 8 8 9 9
