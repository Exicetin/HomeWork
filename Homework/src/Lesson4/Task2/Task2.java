package Lesson4.Task2;

public class Task2 {
    public static void main(String[] args) {
        int[] mass1 = new int[6];
        int[] mass2 = new int[6];
        for(int i = 0;i< mass1.length;i++){
            mass1[i] = (int)(Math.random()*10 + 5);
            for(int j = 0;j< mass2.length;j++){
                mass2[j] = (int)(Math.random()*5 + 0);
                try {
                    System.out.println( mass1[i] +"/" + mass2[j] + " Результат: " + mass1[i]/mass2[j]);
                    continue;
                }catch (ArithmeticException e){
                    System.out.println("На 0 делить нельзя!");
                    break;
                }
            }
        }
    }
}