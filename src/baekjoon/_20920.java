package baekjoon;

import java.io.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 문제 : 영단어 암기는 괴로워
 * - 화은이는 이번 영어 시험에서 틀린 문제를 바탕으로 영어 단어 암기를 하려고 한다.
 * - 만들고자 하는 단어장의 단어 순서는 다음과 같은 우선순위를 차례로 적용하여 만들어진다.
 * - 1.자주 나오는 단어일수록 앞에 배치한다.
 * - 2.해당 단어의 길이가 길수록 앞에 배치한다.
 * - 3.알파벳 사전 순으로 앞에 있는 단어일수록 앞에 배치한다
 * - M보다 짧은 길이의 단어의 경우 읽는 것만으로도 외울 수 있기 때문에 길이가 M이상인 단어들만 외운다고 한다.
 * - 화은이가 괴로운 영단어 암기를 효율적으로 할 수 있도록 단어장을 만들어 주자.
 *
 * 입력
 * - 첫째 줄에는 영어 지문에 나오는 단어의 개수 N과 외울 단어의 길이 기준이 되는 M이 공백으로 구분되어 주어진다.
 * - 둘째 줄부터 N+1번째 줄까지 외울 단어를 입력받는다.
 */
public class _20920 {
    public static void main(String[] args) throws IOException {
        // given
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // when
        Map<String, Integer> wordCounts = countWords(br);
        List<String> sortedWords = sortWords(wordCounts);

        // then
        printWords(bw, sortedWords);
    }

    public static Map<String, Integer> countWords(BufferedReader br) throws IOException {
        // given
        String[] values = br.readLine().split(" ");
        int n = Integer.parseInt(values[0]);
        int m = Integer.parseInt(values[1]);

        // when
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String value = br.readLine();
            if (value.length() >= m) {
                map.put(value, map.getOrDefault(value, 0) + 1);
            }
        }

        // then
        return map;
    }

    public static List<String> sortWords(Map<String, Integer> wordCounts) {
        return wordCounts.keySet().stream().sorted((a, b) -> {
            if (wordCounts.get(a) > wordCounts.get(b)) {
                return -1;
            } else if (wordCounts.get(a) < wordCounts.get(b)) {
                return 1;
            }

            if (a.length() > b.length()) {
                return -1;
            } else if (a.length() < b.length()) {
                return 1;
            }

            return a.compareTo(b);
        }).collect(Collectors.toList());
    }

    public static void printWords(BufferedWriter bw, List<String> sortedWords) throws IOException {
        // when
        for (String word : sortedWords) {
            bw.write(word);
            bw.newLine();
        }

        // then
        bw.flush();
    }

}
