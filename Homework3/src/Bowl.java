public class Bowl {

    private int food;
    public Bowl(int initialFoodAmout){
        this.food = Math.max(initialFoodAmout, 0);
    }
    public int FoodAmount(){
        return food;
    }
public void eatingFood(int catFood){
        if(food >= catFood)
        {
            food -=catFood;
        }
        else {
            System.out.println("There can't be negative amount of cat food ");
        }
}
public void addCatFood(int catFood){
        if(catFood > 0){
            food += catFood;
            System.out.println(catFood+ " of cat food being added to the bowl");
        }
}


}
