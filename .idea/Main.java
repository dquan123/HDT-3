import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        InsertionSort o = new InsertionSort();
        MergeSort o2 = new MergeSort();
        QuickSort o3 = new QuickSort();
        RadixSort o4 = new RadixSort();
        BucketSort o5 = new BucketSort();
        HeapSort o6 = new HeapSort();

        System.out.print("Ingrese el tamaño del vector: ");
        int tamano = scan.nextInt();
        int[] vector = generarVectorAleatorio(tamano);

        boolean seguir = true;

        while (seguir) {
            System.out.println("\n==== MENU ====");
            System.out.println("1. Insertion Sort");
            System.out.println("2. Merge Sort");
            System.out.println("3. Quick Sort");
            System.out.println("4. Radix Sort");
            System.out.println("5. Bucket Sort");
            System.out.println("6. Heap Sort");
            System.out.println("7. Salir");
            System.out.print("Escoga una opcion: ");

            int opcion = scan.nextInt();

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
                case 7:
                    System.out.println("Sesion cerrada");
                    seguir = false;
                    break;
                default:
                    System.out.println("Opcion invalida, intenta de nuevo.");
            }
        }
        scan.close();
    }

    private static int[] generarVectorAleatorio(int tamano) {
        Random rand = new Random();
        int[] vector = new int[tamano];
        for (int i = 0; i < tamano; i++) {
            vector[i] = rand.nextInt(999) + 1;
        }
        return vector;
    }

    private static void procesarOpcion(String nombreAlgoritmo, int[] resultado) {
        mostrarVector(resultado);
    }

    private static void mostrarVector(int[] vector) {
        System.out.println("Vector: " + Arrays.toString(vector));
    }
}