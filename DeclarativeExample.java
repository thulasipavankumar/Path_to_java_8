
import java.util.*;
import java.util.stream.*;

public class DeclarativeExample {
    static List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 4, 5, 5, 6, 7, 7, 8, 9, 9);

    public static void main(String args[]) {
        imperative();
    }

    private static void example1() {
        List<Integer> uniqueList1 = integerList.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println("uniqueList1 : " + uniqueList1);
    }

    private static void example2() {

    }

    private static void imperative() {

        // Remove the duplicates from the list.

        /**
         * Imperative Style
         */
        List<Integer> uniqueList = new ArrayList<>();
        for (Integer i : integerList)
            if (!uniqueList.contains(i)) {
                uniqueList.add(i);
            }
        System.out.println("unique List : " + uniqueList);

    }
}