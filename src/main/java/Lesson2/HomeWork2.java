package Lesson2;

public class HomeWork2 {
    public static void main(String[] args) {
        System.out.println(sumAndCheckIncludeInDiapazon(10,2));
        isPositiveOrNegative (255);
        System.out.println(isNegative (-562));
        printWordNTimes("homework", 15 );
    }
    public static boolean sumAndCheckIncludeInDiapazon(int a, int b){
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }
    public static void isPositiveOrNegative (int i){
        if (i >=0) {System.out.println("Число положительное");}
        else {System.out.println("Число отрицательное");}
    }
    public static boolean isNegative (int y) {
        return y < 0;
    }
    public static void printWordNTimes(String str, int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println("[" + i + "]" + " " + str);}
    }

}


