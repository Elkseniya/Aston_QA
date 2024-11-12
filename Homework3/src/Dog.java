public class Dog extends Animal{
    private String name;
    private int maxDogRun=500;
private int dogMeter=0;
    private int dogSwimMeter=0;

    public Dog(String name, int distance){
        this.name= name;
        this.distance = distance;
    }

    @Override
    public void run() {
        if(distance <=maxDogRun && distance > 0 ){
            System.out.println("Dog "+name + "runs" + distance + "m.");
            dogMeter +=distance;
        }
    }

    @Override
    public void swim() {
        if(distance <= 10 && distance > 0 ){
            System.out.println("Dog " + name + "swims" + distance + "m.");
            dogSwimMeter +=distance;
        }
    }
    public int getDogMeterMeter(){
        return dogMeter;
    }

    public int getDogSwimMeter(){
        return dogSwimMeter;
    }

}
