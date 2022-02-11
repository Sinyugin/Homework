public abstract class Animal {
    private String name;

    public static int counter = 0;

    public void Animal(String name) {
        this.name = name;
        counter++;

    }

    public String getName() {
        return name;
    }

    abstract void run(final int length);

    abstract void swim(final int length);

    public static int getCounter() {
        return counter;
    }

}

