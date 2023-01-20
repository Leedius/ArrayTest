package com.ex2;

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