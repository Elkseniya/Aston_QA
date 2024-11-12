public class Cat extends Animal {
        private String name;
        private int distance;
        private boolean hunger = true;
        private int catMeter=0;


        private int maxCatRun=200;

        public Cat (String name, int distance){
            this.name = name;
            this.distance = distance;
        }

        @Override
        public void run() {
            if (distance <= maxCatRun && distance >0){
                System.out.println("Cat "+name+"runs"+ distance+"m.");
                catMeter+= distance;
            }
        }

        @Override
        public void swim() {
            System.out.println("Cats don't swim");
        }

        public void eat(Bowl bowl) {
            if (bowl.FoodAmount() >= 0 && this.hunger == true) {
                bowl.eatingFood(5);
                this.hunger = false;
                System.out.println("Cat" + this.name + "just ate");

            }
            if (this.hunger == false) {
                System.out.println("Cat " + this.name + " is not hungry");
            } else {
                System.out.println("Cat" + this.name + " is still HUNGRY");
            }
        }
            public boolean condition(){
                return hunger;
            }
            public int getCatMeter(){
            return catMeter;
            }



}
