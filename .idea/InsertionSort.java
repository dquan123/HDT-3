public class InsertionSort {

    // Método que implementa el algoritmo de ordenamiento por inserción
    public int[] ordenamientoPorInsercion(int[] vector) {
        int n = vector.length; // Obtener la longitud del vector
        
        // Recorrer el vector desde la segunda posición hasta el final
        for (int i = 1; i < n; i++) {
            int temporal = vector[i]; // Almacenar el valor actual
            int j = i - 1; // Índice del elemento anterior
            
            // Mover los elementos mayores que el valor actual una posición adelante
            while (j >= 0 && vector[j] > temporal) {
                vector[j + 1] = vector[j];
                j--;
            }
            
            // Insertar el valor en su posición correcta
            vector[j + 1] = temporal;
        }
        
        return vector; // Retornar el vector ordenado
    }
}

