public class HeapSort {

    public int[] ordenamientoHeapSort(int[] vector) {
        int n = vector.length;
        
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(vector, n, i);
        }
        
        for (int i = n - 1; i >= 0; i--) {
            int temporal = vector[0];
            vector[0] = vector[i];
            vector[i] = temporal;
            
            heapify(vector, i, 0);
        }
        
        return vector;
    }
    
    private void heapify(int[] vector, int n, int i) {
        int mayor = i;
        int izquierdo = 2 * i + 1;
        int derecho = 2 * i + 2;
        
        if (izquierdo < n && vector[izquierdo] > vector[mayor]) {
            mayor = izquierdo;
        }
        
        if (derecho < n && vector[derecho] > vector[mayor]) {
            mayor = derecho;
        }
        
        if (mayor != i) {
            int temporal = vector[i];
            vector[i] = vector[mayor];
            vector[mayor] = temporal;
            heapify(vector, n, mayor);
        }
    }
}
