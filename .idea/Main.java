public class Main {
    public static void main(String[] args) {
        InsertionSort o = new InsertionSort();
        MergeSort o2 = new MergeSort();
        int[] vector = {5, 3, 8, 4, 2, 18, 24, 1, 2, 8, 3, 4, 7};


        for (int num : vector) {
            System.out.print(num + " ");
        }
        System.out.println("Original");

        int[] resultado1 = o.ordenamientoPorInsercion(vector);
        int[] resultado2 = o2.ordenamientoMergeSort(vector);

        for (int num : resultado1) {
            System.out.print(num + " ");
        }
        System.out.println("Insertion");
        for (int num : resultado2) {
            System.out.print(num + " ");
        }
        System.out.println("Merge");

    }
}
