import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите радиус окружности в сантиметрах: ");
        int radius = scanner.nextInt();
        double area = calculateCircleArea(radius); // Площадь круга
        double length = calculateCircleLength(radius); // Длина окружности
        System.out.println("Площадь круга: " + area + " см.кв.");
        System.out.println("Длина окружности: " + length + " см.");
    }

    public static double calculateCircleArea (int radius) {
      final double PI = 3.14;
      return PI * Math.pow(radius,2);
    }

    public static double calculateCircleLength (int radius) {
      final double PI = 3.14;
      return 2 * PI * radius;
    }
}
