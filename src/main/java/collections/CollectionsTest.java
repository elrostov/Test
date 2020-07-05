package collections;

import java.util.ArrayList;
import java.util.List;

public class CollectionsTest {

    private static int arraySize = 100_000;

    private static int elementsToAdd = 100_000;

    private ArrayList<Integer> initList = new ArrayList<>(arraySize);

    private static final int size;

    static {
        size = 10;
    }

    public static void main(String[] args) {
        List<Object> lo = new ArrayList<>();
        List<Number> ln = new ArrayList<>();
        List<Integer> li = new ArrayList<>();
        List<Long> ll = new ArrayList<>();
        List<? super Integer> lsi = ln;
        List<? super Number> lsn = lo;
    }

    private static void arrayListAddToStart() {
        System.out.println("\nВставляем в начало ArrayList " + size + " элементов...");
        long start = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
//            initList.add(0, i);
        }
        System.out.println("ArrayList из " + size + " элементов заполнен");
        long finish = System.currentTimeMillis() - start;
        System.out.println("Время заполнения ArrayList: " + finish);
    }

    private static void arrayListAddToMiddle(int size) {
        ArrayList<Integer> initList = new ArrayList<>(size);
        System.out.println("\nВставляем в середину ArrayList " + size + " элементов...");
        long start = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            initList.add(initList.size() / 2, i);
        }
        System.out.println("ArrayList из " + size + " элементов заполнен");
        long finish = System.currentTimeMillis() - start;
        System.out.println("Время заполнения ArrayList: " + finish);
    }

    private static void arrayListAddToEnd(int size) {
        ArrayList<Integer> initList = new ArrayList<>(size);
        System.out.println("\nВставляем в конец ArrayList " + size + " элементов...");
        long start = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            initList.add(i);
        }
        System.out.println("ArrayList из " + size + " элементов заполнен");
        long finish = System.currentTimeMillis() - start;
        System.out.println("Время заполнения ArrayList: " + finish);
    }
}
