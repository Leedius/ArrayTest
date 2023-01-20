//정수를 10개 저장할 수 있는 배열을 생성하고 모든 요소에 3을 넣어라. 그리고 3이 잘 들어갔는지 출력하여 확인해보아라.

package com.ex;

import java.util.Scanner;

public class Ex1_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x;

        System.out.print("몇개의 배열을 만들지 입력하세요 : ");
        x = sc.nextInt();

        int[] arr1 = new int[x];

        for (int i : arr1) {
            arr1[i] = 3;
            System.out.println(arr1[i]);

        }
    }
}