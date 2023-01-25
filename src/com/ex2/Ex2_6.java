//1,2,3을 초기값으로 갖는 배열 arr1과 4,5,6,을 초기값으로 갖는 arr2를 만든다.
//그 후 새로운 배열 newarr을 만들어 arr1과 arr2의 모든 값을 복사해보자.
// 복사 후 newarr은 1,2,3,4,5,6을 가져야 한다.

package com.ex2;

import java.util.Scanner;

public class Ex2_6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int[] arr1={1,2,3};
        int[] arr2={4,5,6};
        int[] newarr=new int[arr1.length+arr2.length];
        int i;

        for(i=0; i<newarr.length; i++){
            if(i<arr1.length){
                newarr[i]=arr1[i];
            }
            else{
                newarr[i]=arr2[i-arr1.length];
            }
            System.out.println(newarr[i]);
        }
    }
}
