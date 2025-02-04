public class QuickSortExample {
    public static void main(String args[]) {
        int arr[] = { 10, 80, 30, 90, 40, 50, 70 };
        int n = arr.length;

        QuickSortExample qse = new QuickSortExample();
        qse.quickSort(arr, 0, n - 1);

        System.out.println("sorted array");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    void quickSort(int arr[], int low, int high) {
        if (low < high) {
            int partitionIndex = partition(arr, low, high);
            quickSort(arr, low, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, high);
        }
    }

    int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                int swapTemp = arr[i];
                arr[i] = arr[j];
                arr[j] = swapTemp;
            }
        }
        int swapTemp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = swapTemp;
        return i + 1;
    }
}
