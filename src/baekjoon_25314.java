import java.util.Scanner;

public class baekjoon_25314 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        long byteValue = scanner.nextLong();
        long count = (byteValue - 1) / 4;

        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i <= count; i++) {
            stringBuffer.append("long ");
        }

        System.out.println(stringBuffer.toString() + "int");
    }
}
