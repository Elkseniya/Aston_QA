public class Main {
    public static void main(String[] args) {

Park myPark = new Park();

Park.Attraction rollerCoaster = myPark.new Attraction("RollerCoaster", "10am = 7 pm", 8.60);
Park.Attraction ferrisWheel= myPark.new Attraction("Ferris Wheel","9am -10pm", 3.99);
System.out.println("name: " +rollerCoaster.name+"; Working Hours: "+ rollerCoaster.workingHours + "; price$:"+rollerCoaster.price);
        System.out.println("name: " +ferrisWheel.name+"; Working Hours: "+ ferrisWheel.workingHours + "; price$:"+ferrisWheel.price);
    }

}

class Park {
    public class Attraction {
        public String name;
        public String workingHours;
        public double price;

        public Attraction(String name, String workingHours, double price) {
            this.name = name;
            this.workingHours = workingHours;
            this.price = price;

        }

        public void printAttractionInfo() {
            System.out.println("Attraction: " + name);
            System.out.println("Working hours: " + workingHours);
            System.out.println("Price: $" + price);

        }

    }
}

