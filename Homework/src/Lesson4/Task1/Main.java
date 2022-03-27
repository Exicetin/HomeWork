package Lesson4.Task1;

public class Main {
    public static void main(String[] args) {
        Car car = new Build().createBuilder("Красный", 150);
        car.on();
        System.out.println(car);
    }
}
