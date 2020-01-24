import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> result = refactor(12);
        System.out.println(result);
    }

    public static List<Integer> refactor(int number) {
        List<Integer> result = new ArrayList<>();

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                result.add(i);
            }
        }
        return result;
    }
}
