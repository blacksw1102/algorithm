package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 문제풀이
 *
 * - 유제품을 '2+1 세일'하는 행사를 하고 있다.
 * - 유제품 3개를 한 번에 산다면 그중에서 가장 싼 건 무료로 지불하고 나머지 두 개의 제품 가격만 지불하면 된다.
 * - 한 번에 3개의 유제품을 사지 않는다면 할인 없이 정가를 지불해야 한다.
 * - 총 N팩의 유제품을 구입하려고 한다.
 * - 재현이를 도와 최소비용으로 유제품을 구입할 수 있도록 도와주세요.
 */
public class _11508 {
    public static void main(String[] args) throws IOException {
        List<Integer> valueList = makeValueList();
        valueList.sort(Collections.reverseOrder());
        int price = calcPirce(valueList);

        System.out.println(price);
    }

    public static List<Integer> makeValueList() throws IOException {
        List<Integer> valueList = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            int value = Integer.parseInt(br.readLine());
            valueList.add(value);
        }

        return valueList;
    }

    public static int calcPirce(List<Integer> valueList) {
        List<Integer> setList = new ArrayList<>();
        int price = 0;

        for (int value : valueList) {
            setList.add(value);

            if (setList.size() == 3) {
                price += setList.get(0) + setList.get(1);
                setList.clear();
            }
        }

        for (int value : setList) {
            price += value;
        }

        return price;
    }

}
