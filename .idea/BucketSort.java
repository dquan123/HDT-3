import java.util.ArrayList;

public class BucketSort {

    // Método principal que implementa el algoritmo Bucket Sort
    public int[] ordenamientoBucketSort(int[] vector) {
        if (vector.length <= 0) { // Si el vector está vacío, retorna el mismo
            return vector;
        }
        
        // Encontrar el valor máximo y mínimo en el vector
        int maximo = vector[0];
        int minimo = vector[0];
        
        for (int i = 1; i < vector.length; i++) {
            if (vector[i] > maximo) {
                maximo = vector[i];
            }
            if (vector[i] < minimo) {
                minimo = vector[i];
            }
        }
        
        int numeroCubetas = vector.length; // Se determina el número de cubetas
        ArrayList<ArrayList<Integer>> cubetas = new ArrayList<ArrayList<Integer>>();
        
        // Inicialización de las cubetas vacías
        for (int i = 0; i < numeroCubetas; i++) {
            cubetas.add(new ArrayList<Integer>());
        }
        
        // Distribuir los elementos en las cubetas según su valor
        for (int i = 0; i < vector.length; i++) {
            int indiceCubeta = (int) ((double)(vector[i] - minimo) / (maximo - minimo + 1) * numeroCubetas);
            cubetas.get(indiceCubeta).add(vector[i]);
        }
        
        // Ordenar cada cubeta utilizando Insertion Sort
        for (int i = 0; i < numeroCubetas; i++) {
            int[] cubetaArray = new int[cubetas.get(i).size()];
            for (int j = 0; j < cubetas.get(i).size(); j++) {
                cubetaArray[j] = cubetas.get(i).get(j);
            }
            cubetaArray = ordenarPorInsercion(cubetaArray);
            cubetas.set(i, new ArrayList<Integer>());
            for (int valor : cubetaArray) {
                cubetas.get(i).add(valor);
            }
        }
        
        // Concatenar las cubetas ordenadas en el vector original
        int indice = 0;
        for (int i = 0; i < numeroCubetas; i++) {
            for (int valor : cubetas.get(i)) {
                vector[indice] = valor;
                indice++;
            }
        }
        
        return vector; // Retornar el vector ordenado
    }
    
    // Método auxiliar: Implementa Insertion Sort para ordenar los elementos dentro de las cubetas
    private int[] ordenarPorInsercion(int[] vector) {
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