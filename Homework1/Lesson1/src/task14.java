public class task14 {
    public static void main(String[] args) {
        int[] array = createArray(10, 5);


        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    public static int[] createArray(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = initialValue;
        }
        return array;
    }
}
