public class MergeSort {

    public int[] ordenamientoMergeSort(int[] vector) {
        if (vector == null || vector.length == 0) {
            return vector;
        }
        mergeSortRecursivo(vector, 0, vector.length - 1);
        return vector;
    }

    private void mergeSortRecursivo(int[] vector, int inicio, int fin) {
        if (inicio < fin) {
            int medio = (inicio + fin) / 2;
            mergeSortRecursivo(vector, inicio, medio);
            mergeSortRecursivo(vector, medio + 1, fin);
            fusionar(vector, inicio, medio, fin);
        }
    }

    private void fusionar(int[] vector, int inicio, int medio, int fin) {
        int nIzquierdo = medio - inicio + 1;
        int nDerecho = fin - medio;

        int[] vectorIzquierdo = new int[nIzquierdo];
        int[] vectorDerecho = new int[nDerecho];

        for (int i = 0; i < nIzquierdo; i++) {
            vectorIzquierdo[i] = vector[inicio + i];
        }
        for (int j = 0; j < nDerecho; j++) {
            vectorDerecho[j] = vector[medio + 1 + j];
        }

        int i = 0;
        int j = 0;
        int k = inicio;

        while (i < nIzquierdo && j < nDerecho) {
            if (vectorIzquierdo[i] <= vectorDerecho[j]) {
                vector[k] = vectorIzquierdo[i];
                i++;
            } else {
                vector[k] = vectorDerecho[j];
                j++;
            }
            k++;
        }

        while (i < nIzquierdo) {
            vector[k] = vectorIzquierdo[i];
            i++;
            k++;
        }

        while (j < nDerecho) {
            vector[k] = vectorDerecho[j];
            j++;
            k++;
        }
    }
}
