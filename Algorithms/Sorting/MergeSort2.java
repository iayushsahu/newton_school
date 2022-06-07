package Sorting;

public class MergeSort2 {
    public static void merge(int arr[], int s, int m, int e) {
        int n1 = m - s + 1;
        int n2 = e - m;

        int a[] = new int[n1];
        int b[] = new int[n2];

        for (int i = 0; i < n1; ++i)
            a[i] = arr[s + i];

        for (int i = 0; i < n2; ++i)
            b[i] = arr[m + 1 + i];

        int i = 0, j = 0, k = s;

        while (i < n1 && j < n2) {
            if (a[i] < b[j])
                arr[k++] = a[i++];
            else
                arr[k++] = b[j++];
        }

        // Some elements left inside a array
        while (i < n1)
            arr[k++] = a[i++];

        // Some elements are left inside b array
        while (j < n2)
            arr[k++] = b[j++];
    }

    public static void mergeSort(int arr[], int s, int e) {
        if (s < e) {
            int m = (s + e) / 2;

            mergeSort(arr, s, m);
            mergeSort(arr, m + 1, e);

            merge(arr, s, m, e);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 3, 6, 9, 2, 5, 8, 1, 4, 7, 9, 6, 3, 8, 5, 2, 7, 4, 1 };

        mergeSort(arr, 0, arr.length - 1);

        for (int x : arr)
            System.out.print(x + " ");
    }
}

// Output => 1 1 2 2 3 3 4 4 5 5 6 6 7 7 8 8 9 9
