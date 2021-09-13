import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "", sub = "";
        String output = "";

        while (true) {
            System.out.print("Введите ASCII код одного символа (end для вывода результата): ");
            input = scanner.nextLine();

            if ("end".equals(input)) {
                break;
            }

            if (!isOctal(input)) {
                System.out.println("Это значение не соответствует запросу");
                continue;
            }

            char c = (char) Integer.parseInt(input, 8);

            output += c;

        }

        System.out.println("Результат: " + output);
    }

    private static boolean isOctal(String str) {
        return str.matches("[0-7]+");
    }

}
