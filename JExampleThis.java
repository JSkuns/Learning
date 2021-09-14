public class Main {
    public static void main(String[] args) {
        Human human1 = new Human();
        human1.setName("Vasya");
        human1.print();
    }
}

class Human {
    String name;

    public void setName(String name) {  // (String newName)
        this.name = name; // name = newName
        // чтобы не вводить дополнительную переменную newName, используем ключевое слово this.
    }

    void print() {
        System.out.println(name);
    }
}
