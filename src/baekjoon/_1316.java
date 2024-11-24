package baekjoon;

import java.util.Scanner;

public class _1316 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int wordCount = scan.nextInt();
        String[] words = new String[wordCount];
        for (int i = 0; i < wordCount; i++) {
            words[i] = scan.next();
        }

        int groupWordCount = 0;
        for (int i = 0; i < wordCount; i++) {
            int[] slots = new int[26];

            char[] chars = words[i].toCharArray();
            char charBuffer = 0;
            for (int j = 0; j < chars.length; j++) {
                if (charBuffer != chars[j]) {
                    slots[chars[j] - 97]++;
                }
                charBuffer = chars[j];
            }

            boolean isGroupWord = true;
            for (int j = 0; j < slots.length; j++) {
                if (slots[j] > 1) {
                    isGroupWord = false;
                    break;
                }
            }

            if (isGroupWord) {
                groupWordCount++;
            }
        }

        System.out.println(groupWordCount);
    }
}
