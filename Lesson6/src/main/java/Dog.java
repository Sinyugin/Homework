public class Dog extends Animal {
    private final int MAX_LENGTH = 500;
    private final int MAX_LENGTH_SWIM = 10;
    private static int counter = 0;

    public Dog(String name) {
        super.Animal(name);
        counter++;
    }

    @Override
    public void run(int length) {
        if (length <= MAX_LENGTH) {
            System.out.printf("Собака %s пробежала %s метров \n", getName(), length);
        } else {
            System.out.printf("Собака %s не сможет пробежать %s метров \n", getName(), length);
        }
    }

    @Override
    public void swim(int length) {
        if (length <= MAX_LENGTH_SWIM) {
            System.out.printf("Собака %s проплыла %s метров \n", getName(), length);
        } else {
            System.out.printf("Собака %s не сможет проплыто %s метров \n", getName(), length);
        }
    }

    public static int getCounter() {
        return counter;
    }
}
