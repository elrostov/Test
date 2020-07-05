package collections.failFastFailSafe;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafeTest {

    /*
    Коллекции с fail-safe итераторами копируют коллекцию для итерации по ней.
    Если в оригинальную коллекцию внесены изменения, то нет никаких гарантий,
    что итератор увидит эти изменения.
    https://www.baeldung.com/java-fail-safe-vs-fail-fast-iterator
     */

    private static ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();

    private static CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();

    public static void main(String[] args) {

        map.put("First", 10);
        map.put("Second", 20);
        map.put("Third", 30);
        map.put("Fourth", 40);

        Iterator<String> mapIterator = map.keySet().iterator();

        while (mapIterator.hasNext()) {
            String key = mapIterator.next();
            map.put("Fifth", 50); // Исключение не вылетает, так как ConcurrentHashMap fail-safe
            System.out.println(key);
        }

        System.out.println(map.size());

        System.out.println("\n---------------------------\n");

        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");

        Iterator<String> listIterator = list.iterator();

        while(listIterator.hasNext()) {
            String str = listIterator.next();
            list.add("five"); // Исключение не вылетает, так как CopyOnWriteArrayList fail-safe
            System.out.println(str);
        }

        System.out.println(list.size());
    }
}
