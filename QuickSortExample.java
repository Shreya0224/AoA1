public class QuickSortExample {
    public static void main(String args[]) {
        int arr[] = {10, 7, 8, 9, 1, 5};
        int n = arr.length;

        QuickSortExample qse = new QuickSortExample();
        qse.quickSort(arr, 0, n-1);

        System.out.println("sorted array");
        for(int i=0; i<n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    void quickSort(int arr[], int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(arr, begin, end);
            quickSort(arr, begin, partitionIndex-1);
            quickSort(arr, partitionIndex+1, end);
        }
    }

    int partition(int arr[], int begin, int end) {
        int pivot = arr[end];
        int i = (begin-1);
        for (int j = begin; j < end; j++) {
            if (arr[j] <= pivot) {
                i++;
                int swapTemp = arr[i];
                arr[i] = arr[j];
                arr[j] = swapTemp;
            }
        }
        int swapTemp = arr[i+1];
        arr[i+1] = arr[end];
        arr[end] = swapTemp;
        return i+1;
    }
}
