import java.util.Scanner;
public class task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Введите число");
        int a = scanner.nextInt();

        isNumberPositive(a);
    }

    public static void isNumberPositive( int a) {
        Scanner scanner = new Scanner(System.in);


        if (a >=0){
            System.out.println("Number is positive");
        } else {
            System.out.println("Number is Negative");
        }
    }
}
