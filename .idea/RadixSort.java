public class RadixSort {

    public int[] ordenamientoRadixSort(int[] vector) {
        int maximo = obtenerMaximo(vector);
        for (int exponente = 1; maximo / exponente > 0; exponente *= 10) {
            conteoPorExpediente(vector, exponente);
        }
        return vector;
    }

    private int obtenerMaximo(int[] vector) {
        int maximo = vector[0];
        for (int i = 1; i < vector.length; i++) {
            if (vector[i] > maximo) {
                maximo = vector[i];
            }
        }
        return maximo;
    }

    private void conteoPorExpediente(int[] vector, int exponente) {
        int n = vector.length;
        int[] vectorTemporal = new int[n];
        int[] contador = new int[10];

        for (int i = 0; i < n; i++) {
            int indice = (vector[i] / exponente) % 10;
            contador[indice]++;
        }

        for (int i = 1; i < 10; i++) {
            contador[i] += contador[i - 1];
        }

        for (int i = n - 1; i >= 0; i--) {
            int indice = (vector[i] / exponente) % 10;
            vectorTemporal[contador[indice] - 1] = vector[i];
            contador[indice]--;
        }

        for (int i = 0; i < n; i++) {
            vector[i] = vectorTemporal[i];
        }
    }
}
