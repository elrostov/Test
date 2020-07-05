package collections;

import java.util.LinkedList;

public class LinkedListTest {

    public static void linkedListAddToStart(int size) {
        LinkedList<Integer> initList = new LinkedList<>();
        System.out.println("\nВставляем в начало LinkedList " + size + " элементов...");
        long start = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            initList.add(0, i);
        }
        initList.get(12);
        System.out.println("LinkedList из " + size + " элементов заполнен");
        long finish = System.currentTimeMillis() - start;
        System.out.println("Время заполнения LinkedList: " + finish);
    }

    public static void linkedListAddToMiddle(int size) {
        LinkedList<Integer> initList = new LinkedList<>();
        System.out.println("\nВставляем в середину LinkedList " + size + " элементов...");
        long start = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            initList.add(initList.size() / 2, i);
        }
        System.out.println("LinkedList из " + size + " элементов заполнен");
        long finish = System.currentTimeMillis() - start;
        System.out.println("Время заполнения LinkedList: " + finish);
    }

    public static void linkedListAddToEnd(int size) {
        LinkedList<Integer> initList = new LinkedList<>();
        System.out.println("\nВставляем в конец LinkedList " + size + " элементов...");
        long start = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            initList.add(i);
        }
        System.out.println("LinkedList из " + size + " элементов заполнен");
        long finish = System.currentTimeMillis() - start;
        System.out.println("Время заполнения LinkedList: " + finish);
    }
}
