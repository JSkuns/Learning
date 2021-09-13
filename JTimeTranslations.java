import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalTime = 0;
        int biggestTime = 0;
        int smallestTime = Integer.MAX_VALUE;

        while (true) {
            System.out.print("Введите название задачи - ");
            String task = scanner.nextLine();
            System.out.print("Сколько дней потребуется на выполнение? - ");
            int days = Integer.parseInt(scanner.nextLine());
            System.out.print("Сколько часов? - ");
            int hours = Integer.parseInt(scanner.nextLine());
            System.out.print("Сколько минут? - ");
            int minutes = Integer.parseInt(scanner.nextLine());

            int currentTimeTask = convertToSeconds(days, hours, minutes);

            totalTime += currentTimeTask;
            if (currentTimeTask > biggestTime) biggestTime = currentTimeTask;
            if (currentTimeTask < smallestTime) smallestTime = currentTimeTask;

            System.out.println("Для завершения работы программы введите `end` для продолжения нажмите enter");

            String input = scanner.nextLine();
            if ("end".equals(input)) {
                break;
            }
        }

        System.out.println("Всего потребуется: " + totalTime + " секунд");
        System.out.println("Самая продолжительная задача займёт: " + biggestTime + " секунд");
        System.out.println("Самая короткая задача займёт: " + smallestTime + " секунд");
    }

    public static int convertToSeconds(int days, int hours, int minutes) {
        int seconds;
        seconds = days * 86400 + hours * 3600 + minutes * 60;
        return seconds;
    }
}
