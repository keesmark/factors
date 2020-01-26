import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<Integer> result = factors(6);
        System.out.println(result);

        List<Integer> perfectsResult = perfects(500);
        System.out.println("perfects is : " + perfectsResult);
    }

    public static List<Integer> factors(int number) {
        List<Integer> result = new ArrayList<>();

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                result.add(i);
            }
        }
        return result;
    }

    public static List<Integer> perfects(int perfectsNum) {
        List<Integer> result = new ArrayList<>();
        List<Integer> numList = new ArrayList<>();

        for (int i = 1; i <= perfectsNum; i++) {
            numList.add(i);
        }

        List<Pair<Integer, List<Integer>>> factoredList = new ArrayList<>();
        for (int i : numList
        ) {
            factoredList.add(new Pair<>(i, factors(i)));
        }

        List<Pair<Integer, Integer>> sumLists = new ArrayList<>();

        for (Pair<Integer, List<Integer>> i : factoredList
        ) {
            int totalValue = total(i.getValue2());
            System.out.println(i.getValue1());
            System.out.println(i.getValue2());
            System.out.println("a" + totalValue);
            sumLists.add(new Pair<>(i.getValue1(), totalValue - i.getValue1()));
        }

        for (Pair<Integer, Integer> pair : sumLists
        ) {
            if (pair.getValue1().equals(pair.getValue2())) {
                result.add(pair.getValue2());
            }
        }
        return result;
    }

    private static int total(List<Integer> num) {
        int total = 0;

        for (int i : num
             ) {
            total = total + i;
        }
        return total;
    }

}
