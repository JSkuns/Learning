public class Main {
    public static void main(String[] args) {
        RecordStudio zyuzya = new RecordStudio();
        RecordStudio zyuzya2 = new RecordStudio("  Zyu Zyu Co", "Zyu Co", 2000, 52);

        System.out.println(zyuzya);
        System.out.println(zyuzya2);
        System.out.println(RecordStudio.counter);
        System.out.println(Utils.trimStudioName(zyuzya2));
    }
}

class RecordStudio {
    static int counter = 0;
    String label;
    String owner;
    int foundationYear;
    int records;

    public RecordStudio() {
        counter++;
    }

    public RecordStudio(String label, String owner, int foundationYear, int records) {
        this.label = label;
        this.owner = owner;
        this.foundationYear = foundationYear;
        this.records = records;
        counter++;
    }
}

class Utils {
    static String trimStudioName(RecordStudio studio) {
        if (studio.label != null) {
            return studio.label.trim();
        }
        return "";
    }
}
