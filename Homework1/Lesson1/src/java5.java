import java.util.Scanner;
public class java5 {
    public static void main(String[] args){

    compareTwoNumbers();
    }
    public static void compareTwoNumbers(){
        Scanner scanner = new Scanner(System.in);


        System.out.println("Введите первое число");
        int a = scanner.nextInt();

        System.out.println("Введите второе число");
        int b = scanner.nextInt();
int value= a + b;

        if (value >= 10 && value <= 20){
            System.out.println("True");
        } else { System.out.println("False");}

    }
}
