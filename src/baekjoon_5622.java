import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class baekjoon_5622 {
    public static void main(String[] args) {
        String[] groups = {"ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ"};
        Map<String, Integer> dials = new LinkedHashMap<>();
        for (int i=0; i<groups.length; i++) {
            final int defaultSecond = i;
            groups[i].chars().mapToObj(c -> Character.toString(c)).forEach(c -> dials.put(c, defaultSecond + 3));
        }

        Scanner scanner = new Scanner(System.in);
        List<String> nums = Arrays.asList(scanner.nextLine().split(""));
        int sum = nums.stream().mapToInt(n -> dials.get(n)).sum();
        System.out.println(sum);
        scanner.close();
    }
}
