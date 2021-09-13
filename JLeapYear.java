import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите год в формате \"yyyy\": ");
        int year = scanner.nextInt();
        int x;

        if (year % 400 == 0) {
            x = 366;
        } else if (year % 100 == 0) {
            x = 365;
        } else if (year % 4 == 0) {
            x = 366;
        } else {
            x = 365;
        }
        print(x);
    }

    public static void print(int x) {
        System.out.println("Количество дней: " + x);
    }
}
