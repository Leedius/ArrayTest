package com.array;

public class Array04 {
    public static void main(String[] args) {
        int[] arr1 = new int[5];
        arr1[0] = 10;
        //arr1 = 100;


        //arr1 배열의 각 요소에
        //1부터 5까지 차례대로 저장하시오.

        //위의 문제 요구사항에 맞게 데이터가 잘 들어갔는지
        //배열의 모든 요소를 출력하여 확인하시오.

        int[] arr2 = {1, 2, 3, 4, 5};
        int i;
        for (i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
        System.out.println();

        //for-each문
        for (int e : arr2) {          // :(콜론) 뒤에 arr2배열에서 순서대로 하나를 뽑아서 e에 대입한다.
            System.out.println(e);

            System.out.println();

            String[] arr3 = {"1", "2", "3", "4", "5"};
            for (String h : arr3) {          // :(콜론) 뒤에 arr2배열에서 순서대로 하나를 뽑아서 e에 대입한다.
                System.out.println(h);
            }
            System.out.println();
        }
        double[] arr5 = {1.1, 2.2, 3.3};
        for(double f : arr5)
            System.out.println(f);

    }
}
