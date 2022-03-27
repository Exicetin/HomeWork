package Lesson4.Task3;

import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
        public static void main(String[] args) {
            int[] mass = new int[4];
            Scanner in = new Scanner(System.in);
            for ( int i = 0; i< mass.length;i++) {
                System.out.print("Введите число: ");
                mass[i]= in.nextInt();
            }
            System.out.println(Arrays.toString(mass));
            for (int i=0,j=mass.length;i<j/2;i++) {
                int new_m = mass[j - i - 1];
                mass[j - i - 1] =mass[i] ;
                mass[i] = new_m;
            }
            System.out.println(Arrays.toString(mass));
        }
    }

