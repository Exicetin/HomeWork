package Lesson1.Task7;

import java.lang.reflect.Array;
import java.util.Arrays;

// Посчитать сумму столбцов и строк в массиве
public class Task7 {
/*
    Подсчет суммы строк и столбцов
    private static void mass() {
        int[][] mas = {
                {0, 0, 0, 0, 0, 0},
                {0, 1, 2, 3, 4, 0},
                {0, 2, 4, 6, 8, 0},
                {0, 3, 6, 9, 12, 0},
                {0, 4, 8, 12, 16, 0},
                {0, 0, 0, 0, 0, 0}
        };
        int sumCol = 0;
        int sumRow = 0;

        for (int i = 0; i < 5; i++) {
          for (int j = 0; j < 5; j++){
              mas[i][mas[i].length - 1] += mas[i][j];
              mas[mas.length-1][j] += mas[i][j];
          }
            System.out.println(Arrays.toString(mas[i]));
        }
        System.out.println("Сумма колонок");
        System.out.println(Arrays.toString(mas[mas.length - 1]));



    }

    public static void main(String[] args) {
        mass();

    }

}
*/
//Доработка алгоритма записи рандомных чисел в массив
    private static void mass() {
        int[][] mas = new int[6][6];



        for (int i = 0; i < 5; i++) {

            for (int j = 0; j < 5; j++){
                mas[i][j] = (int)(Math.random()*10+1);
                mas[i][mas[i].length - 1] += mas[i][j];
                mas[mas.length-1][j] += mas[i][j];
            }
            System.out.println(Arrays.toString(mas[i]));
        }
        System.out.println("Сумма колонок");
        System.out.println(Arrays.toString(mas[mas.length - 1]));

    }

    public static void main(String[] args) {
        mass();

    }

}

