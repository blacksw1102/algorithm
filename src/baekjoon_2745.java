import java.util.Scanner;

public class baekjoon_2745 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        char[] chars = line.split(" ")[0].toCharArray();
        int type = Integer.parseInt(line.split(" ")[1]);

        long sum = 0;
        for(int i=chars.length - 1; i>=0; i--) {
            int value = 0;
            if (chars[i] >= 'A') {
                value = 10 + chars[i] - 'A';
            } else {
                value = chars[i] - 48;
            }
            sum += value * Math.pow(type, (chars.length - i - 1));
        }
        System.out.println(sum);
    }
}
