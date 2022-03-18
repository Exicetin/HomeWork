package Lesson1.Task1;

//программа определения стоимости звонка с учетом скидки 20%, предоставляемой по субботам и воскресеньям
public class Task1 {
    public static void main(String[] args) {
        int price = (int)(Math.random() * 40 + 10);  //рандомно определяем стоимость звонка
        int time = (int)(Math.random()*10+1); //длительность звонка
        int date = (int)(Math.random()*7+1);
        int discPrice;

        switch (date){
            case 6:
                discPrice = (int) ((price - (price * 0.2)) * time);
                System.out.println("Длительность вашего звонка - "+ time +"." +" Стоимость минуты разговора - " + price + "."+ "Так как сегодня суббота стоимость вашегоразговора составит:" + discPrice);
                break; //считаем стоимость звонка в субботу
            case 7:
                discPrice = (int) ((price - (price * 0.2))*time);
                System.out.println("Длительность вашего звонка - "+ time +"." +" Стоимость минуты разговора - " + price + "."+"Так как сегодня воскресенье стоимость вашегоразговора составит:" + discPrice);
                break;//считаем стоимость звонка в воскресенье
            default:
                discPrice = (int)(price*time);
                System.out.println("Длительность вашего звонка - "+ time +"." +" Стоимость минуты разговора - " + price + "." + "Так как сегодня будни скидка не применяется, стоимость вашего заказа:" + discPrice);
                break; //считаем стоимость звонка в будни
        }
    }
}
