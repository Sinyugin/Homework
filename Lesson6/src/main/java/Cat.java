public class Cat extends Animal {
    private final int MAX_LENGTH = 200;
    private static int counter = 0;

    public Cat(String name) {
        super.Animal(name);
        counter++;
    }

    @Override
    public void run(int length) {
        if (length <= MAX_LENGTH) {
            System.out.printf("Кошка %s пробежала %s метров \n", getName(), length);
        } else {
            System.out.printf("Кошка %s не сможет пробежать %s метров \n", getName(), length);
        }
    }

    @Override
    public void swim(int length) {
        System.out.printf("Кошка %s не умеет плавать \n", getName(), length);
    }

    public static int getCounter() {
        return counter;
    }
}
