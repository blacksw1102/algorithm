package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1343 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        boolean isEnable = checkEnable(str);
        String result = (isEnable) ? replace(str) : "-1";

        System.out.println(result);
    }

    public static String replace(String str) {
        String result = str;

        for (String s : str.split("\\.")) {
            String replaceStr = "AAAA".repeat(s.length() / 4) + "BB".repeat(s.length() % 4 / 2);
            result = result.replaceFirst(s, replaceStr);
        }

        return result;
    }

    public static boolean checkEnable(String str) {
        boolean flag = true;

        for (String s : str.split("\\.")) {
            if (s.length() % 2 == 1) {
                flag = false;
                break;
            }
        }

        return flag;
    }

}
