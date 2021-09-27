
import java.util.Locale;
import java.util.Scanner;
public class Equation {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);

        System.out.println("Система решает уравнение вида: ");
        System.out.println("ax^2 + bx + c = 0" );
        double a = readNumber("Введите значение а: ");
        double b = readNumber("Введите значение b: ");
        double c = readNumber("Введите значение с: ");
        double D = Math.pow(b, 2) - 4 * a * c;
        if (D > 0) {
            double x1 = -b + Math.sqrt(D) / (2 * a);
            double x2 = -b - Math.sqrt(D) / (2 * a);
            System.out.println("Корни уравнения: x1 = " + x1 + ", x2 = " + x2);
        }
        else if (D == 0) {
            double X = (-b + Math.sqrt(D)) / (2 * a);
            double x = X;
            System.out.println("Корень уравнения: x = " + x);
        }
        else if (D < 0) {
            System.out.println("Уранение корней не имеет!");
            System.exit(1);
        }
    }

    private static double readNumber(String text) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(text);
        return scanner.nextDouble();
    }
}

