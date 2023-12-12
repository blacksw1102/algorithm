import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class baekjoon_3003 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> nums = Arrays.stream(scan.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> answers = Arrays.asList(1, 1, 2, 2, 2, 8);
        List<Integer> diff = IntStream.range(0, answers.size()).mapToObj(i -> answers.get(i) - nums.get(i)).collect(Collectors.toList());
        String result = diff.stream().map(Object::toString).collect(Collectors.joining(" "));
        System.out.println(result);
    }
}
