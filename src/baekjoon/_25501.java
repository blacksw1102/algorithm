package baekjoon;

import java.io.*;
import java.util.*;

/**
 * 문제 : 재귀의 귀재
 *
 * - 팰린드롬이란, 앞에서부터 읽었을 때와 뒤에서부터 읽었을 때가 같은 문자열을 말한다.
 * - 팰린드롬의 예시로 AAA, ABBA, ABABA 등이 있고, 팰린드롬이 아닌 문자열의 예시로 ABCA, PALINDROME 등이 있다.
 * - 어떤 문자열이 팰린드롬인지 판별하는 문제는 재귀 함수를 이용해 쉽게 해결할 수 있다.
 * - 정휘는 위에 작성된 isPalindrome 함수를 이용하여 어떤 문자열이 팰린드롬인지 여부를 판단하려고 한다.
 * - 문자열 S를 isPalindrome 함수의 인자로 전달하여 팰린드롬 여부를 반환값으로 알아낼 것이다.
 * - 더불어 판별하는 과정에서 recursion 함수를 몇 번 호출하는지 셀 것이다.
 *
 * 입력
 *
 * - 첫째 줄에 테스트케이스의 개수 T가 주어진다. (1 <= T <= 1,000)
 * - 둘째 줄부터 T개의 줄에 알파벳 대문자로 구성된 문자열 S가 주어진다. (1 <= S <= 1,000)
 */
public class _25501 {
    public static void main(String[] args) throws IOException {
        // given
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // when
        List<String> list = inputValues(br);
        for (String value : list) {
            String result = isPalindrome(value);
            bw.write(result);
            bw.newLine();
        }

        // then
        bw.flush();
    }

    public static List<String> inputValues(BufferedReader br) throws IOException {
        // given
        List<String> list = new ArrayList<>();

        // when
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            String value = br.readLine();
            list.add(value);
        }

        // then
        return list;
    }

    public static String recursion(String s, int l, int r, int recursionCount) {
        // given
        int recursionResult;
        String result = "";

        // when
        if (l >= r) {
            recursionResult = 1;
            recursionCount = recursionCount + 1;
            result = String.format("%d %d", recursionResult, recursionCount);
        } else if (s.charAt(l) != s.charAt(r)) {
            recursionResult = 0;
            recursionCount = recursionCount + 1;
            result = String.format("%d %d", recursionResult, recursionCount);
        } else {
            recursionCount = recursionCount + 1;
            result = recursion(s, l + 1, r - 1, recursionCount);
        }

        // then
        return result;
    }

    public static String isPalindrome(String s) {
        return recursion(s, 0, s.length() - 1, 0);
    }

}
