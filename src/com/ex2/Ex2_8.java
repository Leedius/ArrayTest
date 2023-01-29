package com.ex2;

//간단한 로또번호 생성기를 만들어보자. 길이가 6인 정수형 배열을 생성하고, 배열의 모든 요소에
//1에서 45까지의 랜덤한 정수를 넣어보자. 그리고 배열의 모든 요소를 출력해보자. (1과 45를 포함하고 중복값 불가)

import java.util.Scanner;

public class Ex2_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] num;
        int i, j, x;
        int result = 0;


        System.out.print("로또 공의 개수를 입력해주세요 : ");
        x = sc.nextInt();

        num = new int[x];

        for (i = 0; i < num.length; i++) {
            result = (int) (Math.random() * 45+1);
            num[i] = result;
            for (j = 0; j < i; j++) {
                if (num[i] == num[j]) {
                    i--;
                }
            }
        }
        System.out.print("행운의 숫자 : ");
        for(i=0; i<6; i++)
            System.out.print(num[i]+" ");
    }
}

