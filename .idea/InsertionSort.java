public class InsertionSort {
    public int[] ordenamientoPorInsercion(int[] vector) {
        int n = vector.length;
        for (int i = 1; i < n; i++) {
            int temporal = vector[i];
            int j = i - 1;
            while (j >= 0 && vector[j] > temporal) {
                vector[j + 1] = vector[j];
                j--;
            }
            vector[j + 1] = temporal;
        }
        return vector;
    }
}
