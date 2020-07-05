package collections;

import java.util.ArrayList;

public class ArrayListTest {

    public static void arrayListAddToStart(int size) {
        ArrayList<Integer> initList = new ArrayList<>(size);
        System.out.println("\nВставляем в начало ArrayList " + size + " элементов...");
        long start = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            initList.add(0, i);
        }
        System.out.println("ArrayList из " + size + " элементов заполнен");
        long finish = System.currentTimeMillis() - start;
        System.out.println("Время заполнения ArrayList: " + finish);
    }

    public static void arrayListAddToMiddle(int size) {
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

    public static void arrayListAddToEnd(int size) {
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
