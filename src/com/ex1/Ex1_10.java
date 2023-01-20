//정수를 5개 저장할 수 있는 배열을만들고, scanner를 통해 입력받은 값을 하나씩 배열의 요소에 저장해보자.
//만약 키보드로 1 2 3 4 5를 입력했다면 배열의 요소에 각각 1 2 3 4 5가 저장되어야 한다.
//출력을 통해 결과를 확인해 보아라.

package com.ex;

import java.util.Scanner;

public class Ex1_10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int i, j, x;
        int[] arr;

        System.out.print("만들 배열의 개수를 입력하세요 : ");
        x=sc.nextInt();

        arr = new int[x];

        System.out.println(x+"개의 수를 입력하세요!");
        for(i=0; i<x; i++){
            System.out.print((i+1)+"째의 수를 입력하세요 : ");
            arr[i]=sc.nextInt();

        }

        System.out.println("=================================");

        for(j=0; j<x; j++){
            System.out.println(arr[j]);
        }

    }
}
