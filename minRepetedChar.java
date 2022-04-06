package vyas.strings;

import java.util.Scanner;

public class minRepetedChar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
//        String s = "55555";
        int[] arrs = new int[127];
        for (int i = 0; i < s.length(); i++) {
            arrs[s.charAt(i)] = arrs[s.charAt(i)] + 1;
        }
        int min = 1;
        char c = ' ';
        for (int i = 0; i < s.length(); i++) {
            if (min >= arrs[s.charAt(i)]) {
                min = arrs[s.charAt(i)];
                c = s.charAt(i);
            }
        }
        System.out.println(c);
    }
}

