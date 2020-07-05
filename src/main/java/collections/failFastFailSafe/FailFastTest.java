package collections.failFastFailSafe;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FailFastTest {

    public static void main(String[] args) {
        List<String> cities = new ArrayList<>();
        cities.add("Warsaw");
        cities.add("Prague");
        cities.add("Budapest");

        Iterator<String> cityIterator = cities.iterator(); // Активируем итератор
        cityIterator.next();
        cities.remove(1); // Удаление напрямую из коллекции, а не через активный итератор
        cityIterator.next(); // После удаления не через итератор, мы не сможем пользоваться итератором
    }
}
