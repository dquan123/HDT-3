import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // Instancias de las clases de algoritmos de ordenamiento
        InsertionSort o = new InsertionSort();
        MergeSort o2 = new MergeSort();
        QuickSort o3 = new QuickSort();
        RadixSort o4 = new RadixSort();
        BucketSort o5 = new BucketSort();
        HeapSort o6 = new HeapSort();

        boolean seguir = true; // Variable para controlar el menú

        while (seguir) {
            // Mostrar menú de opciones
            System.out.println("\n==== MENU ====");
            System.out.println("1. Insertion Sort");
            System.out.println("2. Merge Sort");
            System.out.println("3. Quick Sort");
            System.out.println("4. Radix Sort");
            System.out.println("5. Bucket Sort");
            System.out.println("6. Heap Sort");
            System.out.println("7. Salir");
            System.out.print("Escoga una opcion: ");

            int opcion = scan.nextInt(); // Leer la opción del usuario
            
            // Si la opción es salir, terminar el bucle
            if (opcion == 7) {
                System.out.println("Sesion cerrada");
                seguir = false;
                break;
            }

            // Validar si la opción ingresada es incorrecta
            if (opcion < 1 || opcion > 7) {
                System.out.println("Opcion invalida, intenta de nuevo.");
                continue;
            }

            // Pedir el tamaño del vector al usuario
            System.out.print("Ingrese el tamaño del vector: ");
            int tamano = scan.nextInt();
            int[] vector = generarVectorAleatorio(tamano); // Generar vector con valores aleatorios

            // Aplicar el algoritmo de ordenamiento seleccionado
            switch (opcion) {
                case 1:
                    procesarOpcion("Insertion", o.ordenamientoPorInsercion(vector));
                    break;
                case 2:
                    procesarOpcion("Merge", o2.ordenamientoMergeSort(vector));
                    break;
                case 3:
                    procesarOpcion("Quick", o3.ordenamientoQuickSort(vector));
                    break;
                case 4:
                    procesarOpcion("Radix", o4.ordenamientoRadixSort(vector));
                    break;
                case 5:
                    procesarOpcion("Bucket", o5.ordenamientoBucketSort(vector));
                    break;
                case 6:
                    procesarOpcion("Heap", o6.ordenamientoHeapSort(vector));
                    break;
            }
        }
        scan.close(); // Cerrar el scanner al finalizar el programa
    }

    // Método para generar un vector de tamaño especificado con valores aleatorios
    private static int[] generarVectorAleatorio(int tamano) {
        Random rand = new Random();
        int[] vector = new int[tamano];
        for (int i = 0; i < tamano; i++) {
            vector[i] = rand.nextInt(999) + 1; // Generar valores aleatorios entre 1 y 999
        }
        return vector;
    }

    // Método para procesar la opción seleccionada y mostrar el resultado
    private static void procesarOpcion(String nombreAlgoritmo, int[] resultado) {
        mostrarVector(resultado);
    }

    // Método para imprimir el vector ordenado
    private static void mostrarVector(int[] vector) {
        System.out.println("Vector: " + Arrays.toString(vector));
    }
}
