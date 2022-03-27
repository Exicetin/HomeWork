package Lesson4.Task1;

public class Build {
    Body buildBody(String color){
        return new Body(color);
    }
    Motor buildMotor(int power){
        return new Motor(power);
    }
    Car createBuilder(String color, int power){
        Body body = buildBody(color);
        Motor motor = buildMotor(power);

        return new Car(motor, body);
    }

}

