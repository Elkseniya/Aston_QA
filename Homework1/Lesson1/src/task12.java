public class task12 {
    public static void main(String[] args) {
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        System.out.println("Исходный массив:");
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();


        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] = array[i] * 2;
            }
        }

        System.out.println("Массив после замены:");
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
