public class Lesson6 {
    public static void main(String[] args) {
        Dog bobik = new Dog("Бобик");
        Dog reks = new Dog("Рекс");

        Cat barsik = new Cat("Барсик");
        Cat murka = new Cat("Мурка");
        Cat vaska = new Cat("Васька");

        bobik.run(400);
        bobik.swim(11);
        reks.run(450);
        reks.swim(8);


        barsik.run(100);
        barsik.swim(5);
        murka.run(150);
        murka.swim(2);
        vaska.run(205);
        vaska.swim(3);

        System.out.println("Всего создано животных " + Animal.getCounter());
        System.out.println("Всего создано собак " + Dog.getCounter());
        System.out.println("Всего создано кошек " + Cat.getCounter());
    }
}
