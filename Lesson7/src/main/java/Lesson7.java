public class Lesson7 {
    public static void main(String[] args) {
        Plate plate = new Plate(30);

        Cat[] cat = new Cat[] {
        new Cat("Барсик", 8),
        new Cat("Васька",10),
        new Cat("Мурзик", 15)
        };
        plate.info();
        feedCat(cat, plate);
        plate.info();
        plate.addFood();
        System.out.println("");
        //feedCat(cat, plate); не пересчитывает второй прогон

    }
    public static void feedCat(Cat[] cat, Plate plate){
        for (int i =0; i < cat.length; i++){
            cat[i].eat(plate);
            cat[i].info();
        }
        System.out.println("");
    }

}
