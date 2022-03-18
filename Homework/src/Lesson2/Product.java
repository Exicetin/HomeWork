package Lesson2;

import java.net.PortUnreachableException;

public abstract class Product {
    String nameProd;

    public Product(String nameProd) {
        this.nameProd = nameProd;
        showInfo();
    }


     abstract int numder();
     double getCost(){
        double cost = 0;

        int dpPrice = 100;
        int wpPrice = 20;
        int ppPrice = 200;
        switch (nameProd){
            case "Весовой":
                cost = wpPrice * numder();
                break;
            case  "Цифровой":
                cost = dpPrice * numder();
                break;

            case "Физический":
                cost = ppPrice * numder();
                break;
            default:
                System.out.println("Проверьте правильность введенных данных!");
        }

        return cost;

    }

    void showInfo(){
        System.out.println("Тип товара который вы выбрали: " + nameProd +  "Стоимость: " + getCost());
    }
}
