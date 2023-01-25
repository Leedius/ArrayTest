package com.이차원배열;

public class 이차원배열2 {
    public static void main(String[] args) {
        //길이가 3인 정수형 2차원배열 생성

        int[][] arr = new int[3][];
        //행마다 가지고 있는 열의 개수는 다를 수 있다.

        arr[0] = new int[3];
        arr[1] = new int[4];
        arr[2] = new int[5];

        //arr.length ? = 3
        //arr[1].length ? = 4
    }
}
