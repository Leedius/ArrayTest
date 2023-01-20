package com.ex;

import javax.security.auth.Subject;
import java.util.Arrays;
import java.util.Scanner;

public class Ex1_12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int i, j, k, x;
        int sum=0;
        double avg=0;
        int[] subject;
        int[] subscore;
        String[] subname;

        System.out.print("과목의 개수를 입력하세요 : ");
        x=sc.nextInt();

        subject=new int[x];
        subscore=new int[x];
        subname=new String[x];

        for(i=0; i<x; i++){
            System.out.print((i+1)+"번째 과목의 제목을 입력하세요 : ");
            subname[i]=sc.next();
        }

        System.out.println("==============================");

        for(j=0; j<x; j++) {
            System.out.print(subname[j]+"의 점수를 입력하세요 : ");
            subscore[j]=sc.nextInt();
        }

        System.out.println("==============================");

        for(k=0; k<x; k++){
            sum+=subscore[k];
        }
        avg=sum/(double)k;
        System.out.println("각 과목에 대한 총점 : "+sum+"\n 각 과목에 대한 평균 : "+avg);

    }
}
