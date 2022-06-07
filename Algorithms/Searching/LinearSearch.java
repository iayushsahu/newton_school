package Searching;

public class LinearSearch {
    public static int linearSearch(int arr[], int element) {
        for (int i = 0; i < arr.length; ++i) {
            if (arr[i] == element) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 6, 9, 2, 5, 8, 1, 4, 7, 0 };
        int element = 2;

        int finded = linearSearch(arr, element);
        finded += 1;

        System.out.print(finded);
    }
}


// output => 4