public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Cat cat = new Cat("Barsik", 10);
        Cat cat1 = new Cat("Plushie", 6);
        Cat cat2= new Cat("Foxie", 24);
        Dog dog = new Dog("Bobik",  400);
        Dog dog1 = new Dog ("Richie", 150);
        Dog dog2 = new Dog ("Wolfie",50);
        Bowl bowl1 = new Bowl(7);
        Bowl bowl2 = new Bowl(15);

        dog.run();
        dog1.run();
        dog2.run();
        cat.run();
        cat1.run();
        cat2.run();

        System.out.println();
        System.out.println();

        dog.swim();
        dog1.swim();
        cat.swim();

        System.out.println();
        System.out.println();

        cat1.eat(bowl1);
        cat2.eat(bowl2);

        System.out.println();
        System.out.println();

        cat1.condition();
        cat2.condition();

        System.out.println();
        System.out.println();

        bowl1.addCatFood(7);
        cat1.eat(bowl1);
        cat1.condition();
        cat1.eat(bowl1);

        System.out.println();
        System.out.println();

        bowl1.FoodAmount();
        bowl1.eatingFood(20);

        System.out.println("Cat "+cat1+"is"+ cat.condition());
        System.out.println("Cat "+cat1+"ran"+ cat.getCatMeter()+"today");
        System.out.println("Dog "+dog2+ "swam"+ dog2.getDogSwimMeter()+"today");



    }
}





