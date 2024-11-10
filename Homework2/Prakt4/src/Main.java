

public class Main {
    public static void main(String[] args) {

       Employee employeeInfo = new Employee();
       employeeInfo.printEmployeeInfo();
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

    public void printEmployeeInfo() {
        System.out.println("name:" + name + "; role:" + role + "; email:" + email + "; phone number:" + phoneNumber + "; paycheck:" + payCheck + "; age:" + age);
    }
}