package lesson1;

public class MainApp {
    public static void main(String[] args){
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        System.out.println();
    }

    private static void compareNumbers() {
        int a=10;
        int b=0;
        if(a>=b) {
            System.out.println("a>=b");
        } else {
            System.out.println("a<b");
        }
    }

    private static void printColor() {
        int value= 55;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value>=0 && value<=100) {
            System.out.println("Желтый");
        } else if (value > 100) {
            System.out.println("Зеленый");
        }

    }

    private static void checkSumSign() {
        int a= -3;
        int b=7;
        int c= a+b;
        if (c>=0){
            System.out.println("Сумма положительная и равна "+ c);
        } else {
            System.out.println("Сумма отрицательная и равна "+ c);
        }

    }

    private static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Aplle");
    }
}