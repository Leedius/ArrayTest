package com.이차원배열;

public class 이차원배열1 {
    public static void main(String[] args) {
        //정수를 3개 저장할 수 있는 배열 arr 선언 및 생성
        int[] arr = new int[3];

        //2차원 배열 생성
        int[][] arr1 = new int[3][4];
        //->arr1.length = 2 : 행의 개수

        //2차원 배열 숫자 넣기
        // 1  2  3
        // 4  5  6
        int i, j, x=0;

        for(i=0; i<arr1.length; i++){
            for(j=0; j<arr1[i].length; j++){
                arr1[i][j]=(arr1[i][j]=++x);
                System.out.print("arr1["+i+"]["+j+"]="+arr1[i][j]+"\t");
            }
            System.out.println();
        }

    }
}
