import java.util.*;
import java.util.stream.Collectors;

public class baekjoon_2908 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<String> nums = Arrays.asList(scanner.nextLine().split(" "));
        List<String> reverseNums = nums.stream().map((n) -> new StringBuffer(n).reverse().toString()).collect(Collectors.toList());
        String maxNums = reverseNums.stream().max(Comparator.comparing(String::toString)).get();
        System.out.println(maxNums);
        scanner.close();
    }
}
