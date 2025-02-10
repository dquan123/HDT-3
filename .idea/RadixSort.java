public class RadixSort {

    // Método principal que ordena el vector usando Radix Sort
    public int[] ordenamientoRadixSort(int[] vector) {
        // Obtiene el valor máximo del vector para determinar el número de dígitos
        int maximo = obtenerMaximo(vector);

        // Aplica el algoritmo de ordenamiento por conteo para cada posición decimal
        for (int exponente = 1; maximo / exponente > 0; exponente *= 10) {
            conteoPorExpediente(vector, exponente);
        }
        return vector;
    }

    // Método para obtener el valor máximo del vector
    private int obtenerMaximo(int[] vector) {
        int maximo = vector[0];
        for (int i = 1; i < vector.length; i++) {
            if (vector[i] > maximo) {
                maximo = vector[i];
            }
        }
        return maximo;
    }

    // Método que realiza el conteo y ordena los números según el dígito actual
    private void conteoPorExpediente(int[] vector, int exponente) {
        int n = vector.length;
        int[] vectorTemporal = new int[n]; // Array auxiliar para almacenar los valores ordenados
        int[] contador = new int[10]; // Arreglo de conteo para los dígitos (0-9)

        // Cuenta la cantidad de ocurrencias de cada dígito en la posición actual
        for (int i = 0; i < n; i++) {
            int indice = (vector[i] / exponente) % 10;
            contador[indice]++;
        }

        // Modifica el arreglo de conteo para obtener las posiciones reales en vectorTemporal
        for (int i = 1; i < 10; i++) {
            contador[i] += contador[i - 1];
        }

        // Construye el vectorTemporal ordenado según la posición decimal actual
        for (int i = n - 1; i >= 0; i--) {
            int indice = (vector[i] / exponente) % 10;
            vectorTemporal[contador[indice] - 1] = vector[i];
            contador[indice]--;
        }

        // Copia los valores ordenados de vectorTemporal de vuelta al vector original
        for (int i = 0; i < n; i++) {
            vector[i] = vectorTemporal[i];
        }
    }
}
