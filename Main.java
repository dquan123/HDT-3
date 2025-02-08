public class Main {
    public static void main(String[] args) {
        ordenamientos o = new ordenamientos();
        int[] vector = {5, 3, 8, 4, 2, 18, 24, 1, 2, 8, 3, 4, 7};


        for (int num : vector) {
            System.out.print(num + " ");
        }

        System.out.println("Quick");
        int[] resultado = o.quick(vector);

        for (int num : resultado) {
            System.out.print(num + " ");
        }

    }
}
