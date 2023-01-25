package com.array;

import java.util.Scanner;

public class lk {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int i=100, j=0;
        int d1=7, d2=9;


        for(j=1; j<i; j++){                     //j가 1부터 계속 1씩 증가
            if(j%d1==0){
                System.out.println(j);          //d1이 7이니까 7의 배수일때 값j 출력
            }
            else if(j%d2==0){
                System.out.println(j);          //d2이 9이니까 8의 배수일때 값j 출력
            }
            //공배수인 63은 7의 배수를 출력하는 코드에서 출력후 else if의 코드를 실행하지않고
            //바로 반복하기때문에 한번만 출력된다.

        }

    }

}
