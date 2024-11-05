public class task10 {
    public static void main(String[] args) {
        int[] array = {0, 1, 0, 1, 1, 0, 1};

        System.out.println("Исходный массив:");
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();


        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            } else {
                array[i] = 0;
            }
        }

        System.out.println("Массив после замены:");
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
