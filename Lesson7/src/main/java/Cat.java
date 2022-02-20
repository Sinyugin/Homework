public class Cat {

    private String name;
    private int appetite;
    private boolean satiety; //сытость

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }

    public void eat(Plate plate) {
        if (appetite < plate.getFood()) {
            plate.decreaseFood(appetite);
            satiety = true;
        } else {
            System.out.printf("Не достаточно еды в тарелке для %s \n", name);
        }
    }

    public void info(){
        System.out.printf("Сытость кота %s \n", name + " " + satiety);
    }
}
