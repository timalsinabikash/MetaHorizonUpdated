package com.meta.java.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class LetterCandles {


    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());
        int M = Integer.parseInt(bufferedReader.readLine());
        String S = bufferedReader.readLine();

        System.out.println(solve(N, M, S));
     /*  System.out.println(solve(6, 2, "bacacc"));    // 6
        System.out.println(solve(15, 3, "xxxxxxxxxxxxxxx"));// 144
        System.out.println(solve(10, 5, "asasasasas"));//

         System.out.println(solver(6, 2, "bacacc"));



        /* a=2, b=1, c=3
        2^2+1^2+3^2=14
        m=2
        ///

        a=5 , s=5
        M=3
        5^2+5^2=50

        * */
    }

        /*Your friend Alice has a box with N letter candles in it.
        The cost of the box is determined as follows - Find the number of occurrences of the distinct
        characters in the box and sum up the squares of these numbers.
        Alice wants to reduce the cost of the box by removing some candles in it.
        However, she is allowed to remove at most M candles from the box.
        Can you help Alice determine the minimum cost of the box?*/





    public static int solve(int N, int M, String S) {
        Set<Character> set = new HashSet<>();
        for (char ch : S.toCharArray()) {
            set.add(ch);
        }

        Map<Character, Integer> map = new HashMap<>();
        set.forEach(ch -> map.put(ch, (int) S.chars().filter(c -> c == ch).count()));

        List<Character> setToList = new ArrayList<>(set);
        if (set.size() == 1) {
            map.put(setToList.get(0), map.get(setToList.get(0)) - M);
        } else {
            int max = Collections.max(map.values());
            for (Map.Entry<Character, Integer> entry : map.entrySet()) {
                if (entry.getValue() == max) {
                    entry.setValue(entry.getValue() - M);
                    break;
                }
            }
        }

        int sum = 0;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            sum += (entry.getValue() * entry.getValue());
        }
        return sum;
    }
}

