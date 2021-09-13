import java.util.Arrays;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        int a[] = new int[] {15, 2, 53, 41, 5}; // объявление массивов
        int b[] = new int[] {10, 20, 30, 40, 50, 60, 70, 80};
        String c[] = new String[10];


        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(a.length); // вывод длины массива
        System.out.println(b.length);
        System.out.println(c.length);
        c[0] = "Hello World!"; // присвоение ячейке '0' массива 'c' значения "Hello World!"


        // вывод при помощи Arrays.toString
        System.out.println(Arrays.toString(a));
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(c));

        // вывод через цикл
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        System.out.println();

        // бинарный поиск
        System.out.println(Arrays.binarySearch(a,41));
        int key = Arrays.binarySearch(b,70);
        System.out.println(key);

        int ab[] = new int[] {};






        int aa[][] = new int [7][7];
        int bb[][] = new int [8][8];

        System.out.println(aa);
        System.out.println(bb);

        System.out.println();

        merge(a, b);
        System.out.println(Arrays.toString(merge(a, b)));

        System.out.println();
        System.out.println(Arrays.toString(merge2(a, b)));

    }

    public static int[] merge(int[] arr1, int[] arr2) { // объединение двух массивов
        int[] result = new int[arr1.length + arr2.length];
        int i = 0, j = 0, r = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                result[r] = arr1[i];
                i++;
            } else {
                result[r] = arr2[j];
                j++;
            }
            r++;
        }
        if (i < arr1.length) {
            System.arraycopy(arr1, i, result, r, (arr1.length - i));
        }
        if (j < arr2.length) {
            System.arraycopy(arr2, j, result, r, (arr2.length - j));
        }
        return result;
    }



    public static int[] merge2(int[] arr1, int[] arr2) { // объединение двух массивов 2 вариант
        int[] arr = Stream.of(arr1, arr2)
                .flatMapToInt(Arrays::stream)
                .boxed()
                .collect(Collectors.groupingBy(e -> e,
                        TreeMap::new, Collectors.counting()))
                .entrySet().stream()
                .flatMapToInt(e ->
                        LongStream.range(0, e.getValue()).mapToInt(v -> e.getKey()))
                .toArray();

        System.out.println(Arrays.toString(arr));
        return arr;
    }


}
