import java.util.Scanner;

public class Main {

    public static double val1;
    public static float val2;
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Выберите номер желаемой операции над double/float:");
        System.out.println("1. Сравнить");
        System.out.println("2. Округлить");
        System.out.println("3. Отбросить дробную часть");

        System.out.print("Введите номер: ");
        int numOp = scanner.nextInt();
        System.out.println();

        switch (numOp) {
            case 1: {
                System.out.print("Введите первое число для сравнения (double): ");
                val1 = scanner.nextDouble();
                System.out.print("Введите второе число для сравнения (float): ");
                val2 = scanner.nextFloat();
                compare(val1, val2);
                break;
            }
            case 2: {
                System.out.print("Введите число для округления (double): ");
                val1 = scanner.nextDouble();
                round(val1);
                break;
            }
            case 3: {
                System.out.print("Отбросить дробную часть числа (double): ");
                val1 = scanner.nextDouble();
                trunc(val1);
                break;
            }
            default: System.out.println("Неверное значение");
        }
    }

    public static void compare(double val1, float val2) {
        boolean result = Math.abs(val1 - val2) < 1e-7 * Math.abs(val2);
        if (result) {
            System.out.println("\nЭти числа равны");
        }
        else if (val1 > val2) {
            System.out.println("\nЧисло " + val1 + " больше, чем " + val2);
        } else {
            System.out.println("\nЧисло " + val2 + " больше, чем " + val1);
        }
    }

    public static void round(double val1) {
        double result = Math.round(val1);
        System.out.println("Результат округления:" + result);
    }

    public static void trunc(double val1) {
        long result = (long) val1;
        System.out.println("Результат:" + result);
    }
}
