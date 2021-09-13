class Main {
    public static void main(String[] args) {
        int z = cube(5);
        System.out.println("5 в кубе: " + z);
    }

    public static int cube(int x) {
        int y = x * x * x;
        //System.out.println(y);
        return y;
    }
}
