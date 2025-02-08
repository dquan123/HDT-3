public class Main {
    public static void main(String[] args) {
        InsertionSort o = new InsertionSort();
        int[] vector = {5, 3, 8, 4, 2, 18, 24, 1, 2, 8, 3, 4, 7};


        for (int num : vector) {
            System.out.print(num + " ");
        }
        System.out.println("Original");

        int[] resultado1 = o.ordenamientoPorInsercion(vector);

        for (int num : resultado1) {
            System.out.print(num + " ");
        }
        System.out.println("Insertion");

    }
}
