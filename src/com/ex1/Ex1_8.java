//정수를 10개 저장할 수 있는 배열을 생성하고,
//각 요소에 1~10까지 차례대로 넣어보라. 그리고 값이 잘 들어갔는지 확인해보라.

package com.ex1;

import java.util.Scanner;

public class Ex1_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x;

        System.out.print("몇개의 배열을 만들지 입력하세요 : ");
        x = sc.nextInt();

        int[] arr1 = new int[x];

        for (int i=0; i<arr1.length; i++) {
            arr1[i] = i+1;
            System.out.print(arr1[i]+" ");

        }
    }
}