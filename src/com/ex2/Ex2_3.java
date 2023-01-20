//2-2문제에서 소수를 출력하지 말고 소수의 개수를 출력해보자.

package com.ex2;

import java.util.Scanner;

public class Ex2_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, j, x;
        int count=0;
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
                count++;
            }
            for (j = 2; j<arr[i]; j++) {
                if (arr[i] % j == 0) {
                    break;
                }
                if(j==arr[i]-1) {
                    count++;
                }
            }
        }
        System.out.println("================================");
        System.out.println("소수의 개수는 : "+count);
    }
}
