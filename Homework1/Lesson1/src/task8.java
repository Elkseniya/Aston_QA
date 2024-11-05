import java.util.Scanner;
public class task8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число");
        int a = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Введите строку");
        String message = scanner.nextLine();

        printNumberAndString(a, message);
    }

    public static void printNumberAndString(int a, String message){

        for(int i = 0;i < a;i++){
            System.out.println(message);
        }
    }
}

