import java.util.Arrays;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        System.out.println("Задача 1:");

        double max = 0;
        double min = 0;
        double average = 0;
       double[] array = new double[10];
       for (int i = 0; i < array.length; i++) {
           array[i] = Math.random();
           max = Arrays.stream(array).max().getAsDouble();
           min = Arrays.stream(array).min().getAsDouble();
           average = Arrays.stream(array).average().getAsDouble();
       }
        System.out.println("Максимальное значение: " + max
                + System.lineSeparator() + "Минимальное значение: " + min
                + System.lineSeparator() + "Среднее значение: " + average);
        System.out.println();

        System.out.println("Задача 2:");

        String text = "Hello";
        char[] arr = text.toCharArray();

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("Повторяющийся символ: " + arr[j]);
                }
            }
        }

        System.out.println();

        System.out.println("Задача 3:");

        System.out.println("Введите температуру: ");

        double temperature = new Scanner(System.in).nextDouble();
        System.out.println("t = " +
                new CelsiusConverter().getConvertedValue(temperature));
        System.out.println("t = " +
                new KelvinConverter().getConvertedValue(temperature));
        System.out.println("t = " +
                new FahrenheitConverter().getConvertedValue(temperature));

        System.out.println();
        System.out.println("Задача 4:");
        System.out.println("Введите часы и минуты в формате -> 15 48");


        Scanner input = new Scanner(System.in);
        while (input.hasNextInt()) {
            String[] num = input.nextLine().split(" ");
            calculateAngle(Integer.parseInt(num[0]), Integer.parseInt(num[1]));
        }

    }
    public static void calculateAngle(int hours, int minutes) {
        float hoursInDegree = hours * 30 + (30 * minutes) / 60f;
        float minutesInDegree = minutes * 6;
        float degree = Math.abs(hoursInDegree - minutesInDegree);
        float result = degree <= 180 ? degree : 360 - degree;
        System.out.println("Время: " + hours + " : " + minutes + ", угол между стрелками: " + result);
    }


}
