package Lesson4.Task1;

public class Car {
    boolean isMotor = false;
    Body body;
    Motor motor;

    public Car(Motor motor, Body body) {
        this.body = body;
        this.motor = motor;
    }

    void on(){
        isMotor = true;
    }

    void off(){
        isMotor = false;
    }

    @Override
    public String toString() {
        String info = "";
        StringBuilder builder = new StringBuilder(info);
        if (isMotor) {
            builder.append("\nСостояние машины: заведена").
                    append("\nМощность двигателя: ").append(motor.getPower()).
                    append("\nЦвет корпуса: ").append(body.getColor());
        } else {
            builder.append("\nСостояние машины: не заведена");
        }
        return builder.toString();
    }

}

