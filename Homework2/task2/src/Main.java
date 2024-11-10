
public class Main {
    public static void main(String[] args) {

        Employee[] employees= new Employee[5];

        employees[0] = new Employee("Alice Tetch", "Bartender" , "1111@gmail.com", "+12345678", 6783.6 , 23 );
        employees[1] = new Employee("Viktor Tetch", "Bartender" , "1111@gmail.com", "+12345678", 6783.6 , 23 );
        employees[2] = new Employee("Frank Tetch", "Bartender" , "1111@gmail.com", "+12345678", 6783.6 , 23 );
        employees[3] = new Employee("Selena Tetch", "Bartender" , "1111@gmail.com", "+12345678", 6783.6 , 23 );
        employees[4] = new Employee("John Tetch", "Bartender" , "1111@gmail.com", "+12345678", 6783.6 , 23 );

        for (Employee employee: employees) {
            System.out.println(employees);
        }
    }

}

class Employee {
    public String name;
    public String role;
    public String email;
    public String phoneNumber;
    public double payCheck;
    public int age;

    public Employee() {
        this.name = "James Gorgon";
        this.role = "Detective";
        this.email = "truecrime@gmail.com";
        this.phoneNumber = "+375444649949";
        this.payCheck = 96399.67;
        this.age = 32;
    }

}
