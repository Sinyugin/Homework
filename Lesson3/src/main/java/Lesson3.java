public class Lesson3 {
    public static void main(String[] args) {
        zadanie1();
        zadanie2();
        zadanie3();
        zadanie4();
        zadanie5(5, 77);
        zadanie6();
    }

    public static void zadanie1(){
        int [] arr = {1, 0, 0, 1, 0, 1, 1, 1, 0, 1};
        for (int i = 0; i <= arr.length - 1; i++){
            if (arr[i] == 0){
                arr[i] = 1;
            } else arr[i] = 0;
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void zadanie2(){
        int [] arr = new int[100];
        for (int i = 0; i < arr.length; i++){
            arr[i] = i + 1;
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void zadanie3(){
        int [] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++){
            if (arr[i] < 6){
                arr[i] = arr[i] * 2;
            }
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void zadanie4(){
        int [][] arr = new int[5][5];
        for (int i = 0; i <= arr.length -1; i++){
            for (int j = 0; j <= arr.length -1; j++){
                if (i == j){
                    arr[i][j] = 1;
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void zadanie5(int len, int initialValue){
        int [] arr = new int[len];
        for (int i = 0; i < len; i++){
            arr[i] = initialValue;
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void zadanie6(){
        int min = 15; // ставим максимальное число из массива для удобства сравнения
        int max = 0;
        int [] arr = {2, 5, 8, 4, 15, 3, 9};
        for (int i = 0; i <= arr.length - 1; i++){
            if (arr[i] < min){
                min = arr[i];
            }
            if (arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Минимальный элемент = " + min);
        System.out.println("Маскимальный элемент = " + max);
    }
}
