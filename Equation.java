import java.util.Locale;
import java.util.Scanner;
public class Equation {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);

        System.out.println("Система решает уравнение вида: ");
        System.out.println("ax^2 + bx + c = 0");
        double a = readNumber("Введите значение а: ");
        double b = readNumber("Введите значение b: ");
        double c = readNumber("Введите значение с: ");
        double D = calc(a, b, c);
        answer(D);
    }

    private static double calc(double a, double b, double c) {
        double D = Math.pow(b, 2) - 4 * a * c;
        return D;
    }

    private static void answer(double D) {
        if (D >= 0) {
            System.out.println("Ответ:" + D);
        }
        else if (D < 0) {
            System.out.println("Ошибка! ");
        }
    }


    private static double readNumber(String text) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(text);
        return scanner.nextDouble();
    }
}

