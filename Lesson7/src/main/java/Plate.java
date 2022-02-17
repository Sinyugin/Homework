public class Plate {

    private int food;
    public int startFood;

    public Plate(int food){
        this.food = food;
        startFood = food;
    }

    public void info(){
        System.out.printf("Сейчас в тарелке %s еды \n ", food);
    }

    public void decreaseFood(int n){
        food -=n;
    }

    public void addFood(){
        food = startFood;
        System.out.printf("Тарелка наполнена, сейчас в ней стало еды %s \n", startFood);
    }

    public int getFood() {
        return food;
    }

}
