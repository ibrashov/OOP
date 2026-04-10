package problem5;

public class Sort {
    public static <E> void swap(E[] array, int i, int j) {
        E temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    public static <E extends Comparable<E>> void quickSort(E[] array, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(array, low, high);
            quickSort(array, low, pivotIndex - 1);   
            quickSort(array, pivotIndex + 1, high);  
        }
    }
    private static <E extends Comparable<E>> int partition(E[] array, int low, int high) {
        E pivot = array[high]; 	
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (array[j].compareTo(pivot) <= 0) {
                i++;
                swap(array, i, j);
            }
        }
        swap(array, i + 1, high);
        return i + 1;
    }
}