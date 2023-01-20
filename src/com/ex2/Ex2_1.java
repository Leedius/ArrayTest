//scanner로 정수 하나를 입력받아, 입력받은 정수만큼의 길이를 갖는 배열을 생성하고 배열에 각 요소에 1 ~ 입력받은 정수로 값을 저장한다.
//예를 들어 5를 입력했으면 길이가 5인 배열을 만들고 각 요소에 1,2,3,4,5가 들어가야 한다.
//그 후 배열에 들어간 수의 평균을 출력해보자.

package com.ex2;

import java.util.Scanner;

public class Ex2_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int x, i;
        int sum=0;
        double avg=0;
        int[] arr;

        System.out.print("원하는 정수를 입력하세요 : ");
        x=sc.nextInt();

        arr=new int[x];

        for(i=0; i<x; i++){
            arr[i]=i+1;
            sum+=arr[i];
        }
        avg=sum/(double)i;
        System.out.println("==============================");
        System.out.println("배열에 들어간 수의 평균은 : "+avg);

    }
}
