package Lesson1.Task4;

public class Task4 {
    // Найти сумму положительных нечетных чисел, меньших 50
        public static void main(String[] args) {
            int sum = 0; // находим сумму чисел
            int i = 0; //счетчик

            while (i <= 50) {
                //пока счетчик меньше 50 - к i рибавляется 1, к сумме прибавляем только нечетные числа, т.е. i
                if (i % 2 != 0) {

                    System.out.println(i);
                    sum += i;
                    i++;
                } else if (i % 2 == 0) {
                    i++;
                }
            }
            System.out.println("Итоговая сумма всех чисел:" + sum);
        }
    }
