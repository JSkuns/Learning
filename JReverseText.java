public class Main {
    public static void main(String[] args) {
        example();
    }

    private static void example() {
        String source = "А роза упала на лапу Азора";
        StringBuilder reversed = new StringBuilder();
        for (int i = source.length() - 1; i >= 0; i--) {
            reversed.append(source.charAt(i));
        }
        System.out.println(reversed);
    }
}
