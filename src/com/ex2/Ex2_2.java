package com.ex2;

import java.util.Scanner;

public class Ex2_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, j, x;
        int[] arr;

        System.out.print("배열의 요소의 끝값을 입력하세요 : ");
        x = sc.nextInt();
        System.out.println("단, 배열은 1부터 1씩 증가한다.");

        arr=new int[x+1];

        for (i = 1; i <=x; i++) {
            arr[i] = i;
        }
        for (i = 1; i <=x; i++) {
            if (arr[i] < 2) {
                continue;
            }
            if (arr[i] == 2) {
                System.out.println(arr[i]);
            }
            for (j = 2; j<arr[i]; j++) {
                if (arr[i] % j == 0) {
                    break;
                }
                if(j==arr[i]-1) {
                    System.out.println(arr[i] + " ");
                }
            }

        }

    }
 }



