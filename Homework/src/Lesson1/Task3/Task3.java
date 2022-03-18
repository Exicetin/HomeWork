package Lesson1.Task3;

import javax.swing.*;

import java.io.IOException;

public class Task3 {

    public static void main(String[] args) throws NumberFormatException, IOException {
        Integer maxAccessSpeed = 30;
        Integer speedGrade = 20;
        Integer fineGrade = 500;
        Integer dangerSpeed = 180;
        int day = Integer.parseInt(JOptionPane.showInputDialog("Введите количество дней просрочки:"));
        int speed = Integer.parseInt(JOptionPane.showInputDialog("Введите скорость:"));

        if(speed>dangerSpeed) {
            System.out.println("-");
        }
        else if(speed>maxAccessSpeed) {
            if (day>30) {
                Integer overSpeed = speed - maxAccessSpeed;
                Integer k = overSpeed / speedGrade;
                Integer fine = k * fineGrade;
                System.out.println("Ваш штраф составит: " + fine);
            }
            else{
                Integer overSpeed = speed - maxAccessSpeed;
                Integer k = overSpeed / speedGrade;
                Integer fine =k * fineGrade/2;
                System.out.println("Ваш штраф со скидкой: " + fine);

            }	}
        else {
            System.out.println("Доброго пути!");
        }
    }

}