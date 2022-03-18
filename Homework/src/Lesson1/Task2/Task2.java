package Lesson1.Task2;

public class Task2 {
    public static void main(String[] args) {
        //Присвоить переменной значение в промежутке от 0 до 5 С помощью оператора switch организовать вывод чисел от а до д
        //Приведены два варианта реализации,
        //Т.к. необходимо использовать switch - case наиболее оптимальный вариант - с обычным выводом (закоментированные строки кода).

        int number = (int) (Math.random() * 5 + 0);
        var i = number;
        switch(number){
            case 0:
                System.out.println("Рандомное число: " + number + "\n" + "Числа от " + number + " до 5:");
                //System.out.println("Числа от " + number + " до 5:" + " 0 1 2 3 4 5");
                while (i<=5){
                    System.out.println(i);
                    i++;
                };
                break;
            case 1:
                System.out.println("Рандомное число: " + number + "\n" + "Числа от " + number + " до 5:");
                //System.out.println("Числа от " + number + " до 5:" + " 1 2 3 4 5");
                while (i<=5){
                    System.out.println(i);
                    i++;
                };
                break;
            case 2:
                System.out.println("Рандомное число: " + number + "\n" + "Числа от " + number + " до 5:");
                //System.out.println("Числа от " + number + " до 5:" + " 2 3 4 5");
                while (i<=5){
                    System.out.println(i);
                    i++;
                };
                break;
            case 3:
                System.out.println("Рандомное число: " + number + "\n" + "Числа от " + number + " до 5:");
                //System.out.println("Числа от " + number + " до 5:" + " 3 4 5");
                while (i<=5){
                    System.out.println(i);
                    i++;
                };
                break;
            case 4:
                System.out.println("Рандомное число: " + number + "\n" + "Числа от " + number + " до 5:");
                //System.out.println("Числа от " + number + " до 5:" + " 4 5");
                while (i<=5){
                    System.out.println(i);
                    i++;
                };
                break;
            case 5:
                System.out.println("Рандомное число: " + number + "\n" + "Числа от " + number + " до 5:");
                //System.out.println("Число от " + number + " до 5:" + " 5");
                while (i<=5){
                    System.out.println(i);
                    i++;
                };
                break;
        }
    }

}
