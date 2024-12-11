package baekjoon;

import java.io.*;

/*
문제
- N번의 자료구조가 나열되어 있고, 각 자료구조에는 한 개의 원소가 들어있다.
- x0을 1번 자료구조에 삽입한 뒤, 1번 자료구조에서 원소를 pop한다. 그 때 pop된 원소를 x1이라 한다.
- x1을 2번 자료구조에 삽입한 뒤, 2번 자료구조에서 원소를 pop한다. 그 때 pop된 원소를 x2이라 한다.
- xN-1을 N번 자료구조에 삽입한 뒤, N번 자료구조에서 원소를 pop한다. 그 때 pop된 원소를 xN이라 한다.
- 도현이는 길이 M의 수열 C를 가져와서 수열의 원소를 앞에서부터 차례대로 queuestack에 삽입한다.
- 이전 삽입 결과는 유지된다.

입력
- 첫째 줄에 자료구조 개수 N이 주어진다.
- 둘째 줄에 길이 N의 수열 A가 주어진다. i번 자료구조는 0일 경우 큐, 1일 경우 스택으로 구성한다.
- 셋째 줄에는 i번 자료구조에 들어 있는 원소를 의미한다.
- 넷째 줄에는 삽입할 수열의 길이 M이 주어진다.
- 다섯째 줄에는 queuestack에 삽입할 길이 M의 수열 C가 주어진다.

출력
원소를 입력할 때마다, 마지막 자료구조에서 리턴되는 값을 출력한다.
 */
public class _24511 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // 입력 초기화
        int n = Integer.parseInt(br.readLine());
        String[] dtValues = br.readLine().split(" ");
        String[] initValues = br.readLine().split(" ");
        int m = Integer.parseInt(br.readLine());
        String[] values = br.readLine().split(" ");

        // 초기 수열
        String result = "";
        for (int i = n - 1; m > 0 && i >= 0; i--) {
            if ("0".equals(dtValues[i])) {
                sb.append(initValues[i]).append(" ");
                m--;
            }
        }

        // 이후 수열
        for (int i = 0; m > 0 && i < values.length; i++) {
            sb.append(values[i]).append(" ");
            m--;
        }

        // 리턴된 수열 목록 출력
        System.out.println(sb.toString().trim());
    }
}
