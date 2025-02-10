import java.util.ArrayList;
import java.util.Arrays;
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
        int[] vector = {4, 5, 23, 53, 1, 5, 5, 54, 63, 3};

        boolean seguir = true;

        while (seguir) {
            System.out.println("\n==== MENU ====");
            System.out.println("1. Insertion Sort");
            System.out.println("2. Merge Sort");
            System.out.println("3. Quick Sort");
            System.out.println("4. Radix Sort");
            System.out.println("5. Bucket Sort");
            System.out.println("6. Heap Sort");
            System.out.println("7. Mostrar el vector original");
            System.out.println("8. Salir");
            System.out.print("Escoga una opcion: ");

            int opcion = scan.nextInt();

            switch (opcion) {
                case 1:
                    procesarOpcion(scan, "Insertion", o.ordenamientoPorInsercion(vector));
                    break;
                case 2:
                    procesarOpcion(scan, "Merge", o2.ordenamientoMergeSort(vector));
                    break;
                case 3:
                    procesarOpcion(scan, "Quick", o3.ordenamientoQuickSort(vector));
                    break;
                case 4:
                    procesarOpcion(scan, "Radix", o4.ordenamientoRadixSort(vector));
                    break;
                case 5:
                    procesarOpcion(scan, "Bucket", o5.ordenamientoBucketSort(vector));
                    break;
                case 6:
                    procesarOpcion(scan, "Heap", o6.ordenamientoHeapSort(vector));
                    break;
                case 7:
                    mostrarVector(vector);
                    break;
                case 8:
                    System.out.println("Sesion cerrada");
                    seguir = false;
                    break;
                default:
                    System.out.println("Opcion invalida, intenta de nuevo.");
            }
        }
        scan.close();
    }

    private static void procesarOpcion(Scanner scan, String nombreAlgoritmo, int[] resultado) {
        mostrarVector(resultado);
        System.out.println("¿Volver al menu principal? (S/N)");
        char respuesta = scan.next().charAt(0);
        if (respuesta == 'N' || respuesta == 'n') {
            System.out.println("Ingresa los elementos del vector separandolos con espacios: ");
            scan.nextLine();
            String entrada = scan.nextLine();
            String[] partes = entrada.split(" ");
            ArrayList<Integer> vectorNuevo = new ArrayList<>();

            for (String parte : partes) {
                vectorNuevo.add(Integer.parseInt(parte));
            }

            int[] arrayNuevo = vectorNuevo.stream().mapToInt(i -> i).toArray();

            switch (nombreAlgoritmo) {
                case "Insertion":
                    mostrarVector(new InsertionSort().ordenamientoPorInsercion(arrayNuevo));
                    break;
                case "Merge":
                    mostrarVector(new MergeSort().ordenamientoMergeSort(arrayNuevo));
                    break;
                case "Quick":
                    mostrarVector(new QuickSort().ordenamientoQuickSort(arrayNuevo));
                    break;
                case "Radix":
                    mostrarVector(new RadixSort().ordenamientoRadixSort(arrayNuevo));
                    break;
                case "Bucket":
                    mostrarVector(new BucketSort().ordenamientoBucketSort(arrayNuevo));
                    break;
                case "Heap":
                    mostrarVector(new HeapSort().ordenamientoHeapSort(arrayNuevo));
                    break;
                default:
                    System.out.println("La opcion ingresada no es valida.");
                    break;
            }
        }
    }

    private static void mostrarVector(int[] vector) {
        System.out.println("Vector: " + Arrays.toString(vector));
    }
}