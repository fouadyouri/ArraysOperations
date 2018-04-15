public class ArraysOperat {

    static public void linearSearch(int value, int arr[], int size) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (arr[i] == value)
                index = i;
        }
        if (index != -1)
            System.out.println("\nthe index of " + value + " = " + index);
        else
            System.out.println("\nthe element " + value + " was not found !!");
    }

    static public int findIndexBinary(int arr[], int start, int end, int value) {
        int middle = (start + end) / 2;
        if (end < start)
            return -1;
        if (arr[middle] == value)
            return middle;

        else if (arr[middle] > value) {
            return findIndexBinary(arr, start, middle - 1, value);
        } else {
            return findIndexBinary(arr, middle + 1, end, value);
        }
    }

    static public void binarySearch(int arr[], int size, int value) {
        int index = findIndexBinary(arr, 0, size, value);
        if (index != -1)
            System.out.println("\nthe element " + arr[index] + " was found at index " + index);
        else
            System.out.println("\nthe element " + value + " was not found !! ");
    }

    static public void print(int arr[], int size) {
        System.out.println("\n == The array contains ==");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static public void insertAt(int arr[], int size, int index, int value) {
        for (int i = size - 2; i >= index; --i) {
            arr[i + 1] = arr[i];
        }
        arr[index] = value;
        System.out.println("\nthe element " + value + " was added to the index " + index);
    }

    static public void deleteAt(int arr[], int size, int index) {
        if (index >= size)
            System.out.println("\nThe array does not contain the index " + index + " !!");
        else if (index == size - 1) {
            System.out.println("\nthe element " + arr[index] + " at the index " + index + " was deleted !!");
            arr[index] = 0;
        } else {
            System.out.println("\nthe element " + arr[index] + " at the index " + index + " was deleted !!");
            for (int i = index; i < size - 1; i++) {
                arr[i] = arr[i + 1];
            }

        }
    }

    static public void delete(int arr[], int size, int value) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (arr[i] == value)
                index = i;
        }
        if (index != -1)
            deleteAt(arr, size, index);
        else
            System.out.println("\nthe element " + value + " was not found !!");
    }

    static public void main(String[] args) {
        int size = 20;
        int arr[] = new int[size];

        arr[0] = 25;
        arr[1] = 166;
        arr[2] = 6;
        arr[3] = 289;
        arr[4] = 75;
        arr[5] = 999;
        arr[6] = 00;
        arr[7] = 1;
        arr[8] = 64;
        arr[9] = 320;

        print(arr, size);

        linearSearch(166, arr, size);

        linearSearch(333, arr, size);

        insertAt(arr, size, 0, 77);

        print(arr, size);

        insertAt(arr, size, 14, 1000);

        print(arr, size);

        deleteAt(arr, size, 20);

        print(arr, size);

        insertAt(arr, size, 19, 1);

        print(arr, size);

        deleteAt(arr, size, 19);

        print(arr, size);

        deleteAt(arr, size, 0);

        print(arr, size);

        delete(arr, size, 999);

        print(arr, size);

        delete(arr, size, 46);

        print(arr, size);

        int arr2[] = {0, 2, 4, 5, 7, 9, 13, 16, 19, 24, 29, 35, 47, 66};
        binarySearch(arr2, 13, 25);

        binarySearch(arr2, 13, 66);

        binarySearch(arr2, 13, 13);
    }
}
