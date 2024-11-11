public class Main {
    public static void main(String[] args) {

        Employee employeeInfo = new Employee();

        System.out.println("Name:"+employeeInfo.getName()+";\n Position:"+employeeInfo.getRole()+";\n Email:"+employeeInfo.getEmail()+";\n Phone number:"+employeeInfo.getPhoneNumber()+";\n Salary:"+employeeInfo.getPayCheck()+";\n Age:"+employeeInfo.getAge());

        Employee[] employees= new Employee[5];

        employees[0] = new Employee("Alice Tetch", "Bartender" , "1111@gmail.com", "+12345678", 6783.6 , 23 );
        employees[1] = new Employee("Viktor Tetch", "Bartender" , "1111@gmail.com", "+12345678", 6783.6 , 23 );
        employees[2] = new Employee("Frank Tetch", "Bartender" , "1111@gmail.com", "+12345678", 6783.6 , 23 );
        employees[3] = new Employee("Selena Tetch", "Bartender" , "1111@gmail.com", "+12345678", 6783.6 , 23 );
        employees[4] = new Employee("John Tetch", "Bartender" , "1111@gmail.com", "+12345678", 6783.6 , 23 );

        for (Employee employee: employees) {
            System.out.println(employees);
        }



        Park myPark = new Park();



Park.Attraction rollerCoaster = myPark.new Attraction("RollerCoaster", "10am - 7 pm", 8.60);
Park.Attraction ferrisWheel= myPark.new Attraction("Ferris Wheel","9am -10pm", 3.99);

System.out.println("name: " +rollerCoaster.getName()+";\n Working Hours: "+ rollerCoaster.getWorkingHours() + ";\n price$:"+rollerCoaster.getPrice());
        System.out.println("name: " +ferrisWheel.getName()+";\n Working Hours: "+ ferrisWheel.getWorkingHours() + ";\n price$:"+ferrisWheel.getPrice());

    }

}


class Employee {
    private String name;
    private String role;
    private String email;
    private String phoneNumber;
    private double payCheck;
    private int age;

    public Employee() {
        this.name = "James Gorgon";
        this.role = "Detective";
        this.email = "truecrime@gmail.com";
        this.phoneNumber = "+375444649949";
        this.payCheck = 96399.67;
        this.age = 32;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public double getPayCheck(){
        return payCheck;
    }

    public int getAge() {
        return age;
    }

}





class Park {
    public class Attraction {
        private String name;
        private String workingHours;
        private double price;

        public Attraction(String name, String workingHours, double price) {
            this.name = name;
            this.workingHours = workingHours;
            this.price = price;

        }

        public String getName(){
            return name;
        }

        public String getWorkingHours(){
            return workingHours;
        }

        public double getPrice() {
            return price;
        }

        public void printAttractionInfo() {
            System.out.println("Attraction: " + name);
            System.out.println("Working hours: " + workingHours);
            System.out.println("Price: $" + price);

        }

    }
}

