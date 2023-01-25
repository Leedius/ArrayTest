//간단한 성적처리 시스템을 만들어보자. 국어, 영어, 수학점수를 입력받아
//각과목에 대한 점수 및 총점,평 균을 출력하는 프로그램을 만들얼보자.
//만약 키보드로 1 2 3 4 5를 입력했다면 배열의 요소에 각각 1 2 3 4 5가 저장되어야 한다.
//출력을 통해 결과를 확인해 보아라.


package com.ex1;


import java.util.Scanner;

public class Ex1_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, j, k, x;
        int sum = 0;
        double avg = 0;
        int[] subscore;
        String[] subname;

        System.out.print("과목의 개수를 입력하세요 : ");
        x = sc.nextInt();


        subscore = new int[x];
        subname = new String[x];

        for (i = 0; i < subname.length; i++) {
            System.out.print((i + 1) + "번째 과목의 제목을 입력하세요 : ");
            subname[i] = sc.next();

        }

        System.out.println("==============================");

        for (j = 0; j < subscore.length; j++) {
                System.out.print(subname[j] + "의 점수를 입력하세요 : ");
                subscore[j] = sc.nextInt();
                while(subscore[j]>100||subscore[j]<0){
                    System.out.print("점수가 잘못입력되었습니다.\n다시입력해주세요 : ");
                    subscore[j] = sc.nextInt();
                }

            }

            System.out.println("==============================");

            for (k = 0; k < subscore.length; k++) {
                sum += subscore[k];
                System.out.println(subname[k]+"의 점수 : "+subscore[k]);
            }
            avg = sum / (double) k;

            System.out.println("각 과목에 대한 총점 : " + sum + "\n각 과목에 대한 평균 : " + avg);

        }
}