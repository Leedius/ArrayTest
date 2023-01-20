
package com.array;

public class Array01 {
    public static void main(String[] args) {
        //배열의 선언
        //정수를 여러개 저장할 수 있는 배열 arr1 선언(정수로 선언했으니 정수만 가능)
        int a;      //변수선언
        a = 10;       //초기화

        int[] arr1;     //int arr1[];
        //배열의 생성-> 각 칸에 0이 초기화된다.
        //정수를 5개 저장할 수 있는 배열 arr1을 생성
        arr1 = new int[5];

        //기본자료형 선언 및 초기화 동시 작업
        int num = 10;
        //배열의 선언과 생성을 동시에!
        int[] arr2 = new int[3];          //arr2의 배열을 선언하고 3칸을 만들고 칸마다 정수 0으로 초기화한다.
        //주의 : int[3] arr2; 불가능!

        //실수를 여러개 저장할 수 있는 배열 arr를 선언하고 생성
        double[] arr4;
        //생성 후 초기화 값은 0.0
        arr4 = new double[10];

        //문자열 5개를 저장할 수 있는 배열 arr5 생성
        String[] arr5 = new String[5];
        //생성 초기화 값은 null.(""없는 문자열)


    }
}