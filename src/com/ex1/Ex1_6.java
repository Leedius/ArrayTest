//정수를 10개 저장할 수 이쓴ㄴ 배열을 생성하고 모든 요소의 값을 출력해보아라.

package com.ex1;


import java.util.Scanner;

public class Ex1_6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int x;

        System.out.print("몇개의 배열을 만들지 입력하세요 : ");
        x=sc.nextInt();

        int[] arr1 = new int[x];

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = i;
            //System.out.println(arr1[1]);
        }

        int count = 0;
        //for (int k = 0; k < 10; k++) {
            for (int j = 0; j < x; j++) {
                System.out.print(arr1[count] + " ");
                count++;
          //  }
          //  System.out.println();

        }
    }
}