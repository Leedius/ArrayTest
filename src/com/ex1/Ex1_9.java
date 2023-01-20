//1,5,7을 초기값으로 저장하고 있는 배열을 만들고, 배열의 모든 요소의 합을 출력해보아라.

package com.ex;

import java.util.Scanner;

public class Ex1_9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int sum=0;
        int i, j, x;
        int[] arr;

        System.out.print("만들 배열의 개수를 입력하세요 : ");
        x=sc.nextInt();

        arr = new int[x];

        System.out.println(x+"개의 숫자를 입력하세요!");
        for(i=0; i<x; i++){
            System.out.print((i+1)+"번째 숫자 : ");
            arr[i]=sc.nextInt();
        }
        for(j=0; j<3; j++){
            sum+=arr[j];
        }
        System.out.println("배열의 모든 요소의 합은 : "+sum);
    }
}
