public class MergeSort {

    // Método principal que inicia el Merge Sort
    public int[] ordenamientoMergeSort(int[] vector) {
        // Verifica si el vector es nulo o tiene longitud 0
        if (vector == null || vector.length == 0) {
            return vector;
        }
        // Llama al método recursivo para ordenar
        mergeSortRecursivo(vector, 0, vector.length - 1);
        return vector;
    }

    // Método recursivo para dividir el vector y ordenarlo
    private void mergeSortRecursivo(int[] vector, int inicio, int fin) {
        if (inicio < fin) {
            int medio = (inicio + fin) / 2; // Encuentra el punto medio
            mergeSortRecursivo(vector, inicio, medio); // Ordena la primera mitad
            mergeSortRecursivo(vector, medio + 1, fin); // Ordena la segunda mitad
            fusionar(vector, inicio, medio, fin); // Fusiona ambas mitades
        }
    }

    // Método que fusiona dos subvectores ordenados en el vector principal
    private void fusionar(int[] vector, int inicio, int medio, int fin) {
        int nIzquierdo = medio - inicio + 1; // Tamaño del subvector izquierdo
        int nDerecho = fin - medio; // Tamaño del subvector derecho

        // Crear subvectores temporales
        int[] vectorIzquierdo = new int[nIzquierdo];
        int[] vectorDerecho = new int[nDerecho];

        // Copiar datos a los subvectores temporales
        for (int i = 0; i < nIzquierdo; i++) {
            vectorIzquierdo[i] = vector[inicio + i];
        }
        for (int j = 0; j < nDerecho; j++) {
            vectorDerecho[j] = vector[medio + 1 + j];
        }

        int i = 0; // Índice para el subvector izquierdo
        int j = 0; // Índice para el subvector derecho
        int k = inicio; // Índice para el vector principal

        // Combinar los vectores izquierdo y derecho en orden
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

        // Copiar los elementos restantes del subvector izquierdo
        while (i < nIzquierdo) {
            vector[k] = vectorIzquierdo[i];
            i++;
            k++;
        }

        // Copiar los elementos restantes del subvector derecho
        while (j < nDerecho) {
            vector[k] = vectorDerecho[j];
            j++;
            k++;
        }
    }
}
