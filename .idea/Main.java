public class Main {
    public static void main(String[] args) {
        InsertionSort o = new InsertionSort();
        MergeSort o2 = new MergeSort();
        QuickSort o3 = new QuickSort();
        RadixSort o4 = new RadixSort();
        BucketSort o5 = new BucketSort();
        HeapSort o6 = new HeapSort();
        int[] vector = {4,5,23,53,1,5,5,54,63,3};


        for (int num : vector) {
            System.out.print(num + " ");
        }
        System.out.println("Original");

        int[] resultado1 = o.ordenamientoPorInsercion(vector);
        int[] resultado2 = o2.ordenamientoMergeSort(vector);
        int[] resultado3 = o3.ordenamientoQuickSort(vector);
        int[] resultado4 = o4.ordenamientoRadixSort(vector);
        int[] resultado5 = o5.ordenamientoBucketSort(vector);
        int[] resultado6 = o6.ordenamientoHeapSort(vector);

        for (int num : resultado1) {
            System.out.print(num + " ");
        }
        System.out.println("Insertion");
        for (int num : resultado2) {
            System.out.print(num + " ");
        }
        System.out.println("Merge");
        for (int num : resultado3) {
            System.out.print(num + " ");
        }
        System.out.println("Quick");
        for (int num : resultado4) {
            System.out.print(num + " ");
        }
        System.out.println("Radix");
        for (int num : resultado5) {
            System.out.print(num + " ");
        }
        System.out.println("Bucket");
        for (int num : resultado6) {
            System.out.print(num + " ");
        }
        System.out.println("Heap");

    }
}
