public class Employee {
    public String name;
    public String role;
    public String email;
    public String phoneNumber;
    public double payCheck;
    public int age;

    public Emploee(String name, String role, String email, String phoneNumber, double payCheck, int age) {
        this.name = "James Gorgon";
        this.role = "Detective";
        this.email = "truecrime@gmail.com";
        this.phoneNumber = "+375444649949";
        this.payCheck = 96399.67;
        this.age = 32;
    }

    public void printEmploeeInfo() {
        System.out.println("name:" + name + "; role:" + role + "; email:" + email + "; phone number:" + phoneNumber + "; paycheck:" + payCheck + "; age:" + age);
    }
}


    public static void main(String[] args) {

        Emploee emploeeInfo = new Emploee(String name, String role, String email, String phoneNumber, double payCheck,
        int age);
        emploeeInfo.printEmploeeInfo();
    }
