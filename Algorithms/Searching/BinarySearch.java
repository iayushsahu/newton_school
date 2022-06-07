package Searching;

public class BinarySearch {
    public static int binarySearch(int arr[], int element) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == element) {
                return mid;
            } else if (arr[mid] < element) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 }; // binary Search need sorted array
        int element = 5;

        int finded = binarySearch(arr, element);
        finded += 1;

        System.out.print(finded);
    }
}


// output => index 6;