//초기값을 5,4,3,2,1로 갖는 배열 arr을 만들자.
// 그리고 길이가 5인 새로운 정수형 배열newarr을 만든 후 arr이 가진 값을 newarr로 복사하여 보자.
//복사 결과는 출력을 통해 확인한다.

package com.ex2;

public class Ex2_5 {
    public static void main(String[] args) {

        int[] arr1={5, 4, 3, 2, 1};
        int[] arr2=new int[5];
        int i;

        for(i=0; i<arr1.length; i++){
            arr2[i]=arr1[i];
            System.out.print(arr2[i]+" ");
        }
    }
}
