package Lesson4;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
    private static final int SIZE = 3;
    private static final char DOT_EMPTY = '.';
    private static final char DOT_HUMAN = 'X';
    private static final char DOT_AI = '0';
    public static final String HEADER_FIRST_SYMBOL = "♛";
    public static final String SPACE_MAP_SYMBOL = " ";
    private static char [][] MAP = new char[SIZE][SIZE];
    private static final Scanner in = new Scanner(System.in);
    private static final Random random = new Random();
    private static int turnsCount = 0;


    public static void main (String[] args){
        start();
    }

    public static void start() {
        do {
            System.out.println("Начало игры!!!");
            init();
            printMap();
            playGame();
        } while (isContinueGame());
    }
    private static boolean isContinueGame(){
        System.out.println("Начать заново? y\\n");
        return switch (in.next()){
            case "y", "н", "у", "+", "да" -> true;
            default -> false;
            };
    }
    private static void init() {
        turnsCount = 0;
        initMap();
    }

    private static void playGame() {
        while (true) {
            humanTurn();
            printMap();
            if (checkEnd(DOT_HUMAN)){
                break;
            }

            aiTurn();
            printMap();
            if (checkEnd(DOT_AI)){
                break;
            }
        }
    }
    private static void humanTurn(){
        System.out.println("\nХОД ЧЕЛОВЕКА!");

        int rowNumber;
        int columnNumber;

        while (true) {
            System.out.print("Введите координату строки: ");
            rowNumber = in.nextInt() - 1;
            System.out.print("Введите координату столбца: ");
            columnNumber = in.nextInt() - 1;

            if (isCellFree(rowNumber, columnNumber)){
                break;
            }
            System.out.printf("Ошибка! Ячейка с координатами %s:%s уже используется!%n", rowNumber + 1, columnNumber + 1);
        }

        MAP[rowNumber][columnNumber] = DOT_HUMAN;
        turnsCount++;
    }
    private static boolean checkEnd(char dot){
        if (checkWin(dot)) {
            if (dot == DOT_HUMAN){
                System.out.println("Победа за Вами!");
            } else {
                System.out.println("Увы, Вы проиграли");
            }
            return true;
        }

        if (checkDraw()){
            System.out.println("Ничья!");
            return true;
        }
        return false;
    }
    private static boolean checkWin(char dot){
        for (int i = 0; i < 3; i++)
            if ((MAP[i][0] == dot && MAP[i][1] == dot &&
                    MAP[i][2] == dot) ||
                    (MAP[0][i] == dot && MAP[1][i] == dot &&
                            MAP[2][i] == dot))
                return true;
        else if ((MAP[0][0] == dot && MAP[1][1] == dot &&
                MAP[2][2] == dot) ||
                (MAP[2][0] == dot && MAP[1][1] == dot &&
                        MAP[0][2] == dot))
            return true;
        return false;
    }
    private static boolean checkDraw(){
        return turnsCount >= SIZE * SIZE;
    }
    private static void aiTurn(){
        System.out.println("\nХОД КОМПЬЮТЕРА!");

        int rowNumber;
        int columnNumber;

        do {
            rowNumber = random.nextInt(SIZE);
            columnNumber = random.nextInt(SIZE);
            if (isCellFree(rowNumber, columnNumber)){
                break;
            }
        } while (!isCellFree(rowNumber, columnNumber));

        MAP[rowNumber][columnNumber] = DOT_AI;
        turnsCount++;
    }
    private static boolean isCellFree(int rowNumber, int columnNumber){
        return MAP[rowNumber][columnNumber] == DOT_EMPTY;
    }

    private static void initMap() {
        MAP = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                MAP[i][j] = DOT_EMPTY;
            }
        }
    }

    private static void printMap() {
        printHeaderMap();
        printBodyMap();
    }

    private static void printBodyMap() {
        for (int i = 0; i < SIZE; i++) {
            printMapNumber(i);
            for (int j = 0; j < SIZE; j++) {
                System.out.print(MAP[i][j] + SPACE_MAP_SYMBOL);
            }
            System.out.println();
        }
    }

    private static void printHeaderMap() {
        System.out.print(HEADER_FIRST_SYMBOL + SPACE_MAP_SYMBOL);
        for (int i = 0; i < SIZE; i++) {
            printMapNumber(i);
        }
        System.out.println();
    }

    private static void printMapNumber(int i) {
        System.out.print(i + 1 + SPACE_MAP_SYMBOL);
    }


}
