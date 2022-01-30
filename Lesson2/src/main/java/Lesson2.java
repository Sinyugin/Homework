public class Lesson2 {
    public static void main(String[] args) {
        System.out.println(zadanie1(10,11));
        zadanie2(-20);
        System.out.println(zadanie3(-10));
        zadanie4("Строка с текстом", 5);
        System.out.println(zadanie5(2022));
    }
    public static boolean zadanie1(int a, int b){
        int rezult = a + b;
        return ((rezult >= 10) && (rezult <= 20));
    }

    public static void zadanie2(int a){
        if (a >= 0){
            System.out.println("Введенное число " + a + " положительное");
        } else System.out.println("Введенное число " + a + " отрицательное");
    }

    public static boolean zadanie3(int a){
        return (a < 0);
    }

    public static void zadanie4(String a, int b){
        for (int i = 1; i <= b; i++){
            System.out.println(a);
        }
    }

    public static boolean zadanie5(int x){
        return (x % 4 == 0 && (x % 100 != 0 || x % 400 == 0));
    }
}
