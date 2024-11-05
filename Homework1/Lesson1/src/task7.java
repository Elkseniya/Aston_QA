import java.util.Scanner;
public class task7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число");
        int a = scanner.nextInt();

        isNumberPositive(a);
    }

    public static void isNumberPositive(int a) {


        if (a >=0){
            System.out.println("False");
        } else {
            System.out.println("True");
        }
    }
}
