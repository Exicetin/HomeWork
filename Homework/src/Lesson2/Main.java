package Lesson2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //String DigitalProd = String.valueOf(new DigitalProd("Цифровой"));
        Scanner sc = new Scanner(System.in);
        String nameProd = sc.nextLine();
        System.out.println("Тип вашего товара: " + nameProd);
        switch (nameProd){
            case "Весовой":
                String we = String.valueOf(new WeightProd("Весовой"));
                break;
            case  "Цифровой":
                String DigitalProd = String.valueOf(new DigitalProd("Цифровой"));
                break;
            case "Физический":
                String PhysicalProd = String.valueOf(new PhysicalProd("Цифровой"));
                break;
            default:
                System.out.println("Проверьте правильность введенных данных!");
                break;

        }


    }
}
