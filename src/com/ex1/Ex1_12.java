//간단한 성적처리 시스템을 만들어보자. 국어, 영어, 수학점수를 입력받아
//각과목에 대한 점수 및 총점,평 균을 출력하는 프로그램을 만들얼보자.
//만약 키보드로 1 2 3 4 5를 입력했다면 배열의 요소에 각각 1 2 3 4 5가 저장되어야 한다.
//출력을 통해 결과를 확인해 보아라.

package com.ex1;

import java.util.Scanner;

public class Ex1_12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int i,x;
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

        for(i=0; i<x; i++) {
            System.out.print(subname[i]+"의 점수를 입력하세요 : ");
            subscore[i]=sc.nextInt();
        }

        System.out.println("==============================");

        for(i=0; i<x; i++){
            sum+=subscore[i];
        }
        avg=sum/(double)i;
        System.out.println("각 과목에 대한 총점 : "+sum+"\n 각 과목에 대한 평균 : "+avg);

    }
}
