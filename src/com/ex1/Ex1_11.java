//1, 2, 3, 4, 5, 6, 7, 8로 초기화된 배열을 만들고, 배열의 요소 중 짝수의 개수를 구하는 프로그램을 만들어라.

package com.ex1;

import java.util.Scanner;

public class Ex1_11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int i, x;
        int count=0;
        int[] arr;

        System.out.print("몇개의 배열을 만들지 입력하세요 : ");
        x=sc.nextInt();
        arr=new int[x];

        for(i=0; i<arr.length; i++){
            arr[i]=i+1;
        }
        for(int j : arr){
            if(j%2==0){
                count++;
            }
        }
        System.out.println("배열의 요소중 짝수의 개수 : "+count);
    }
}
