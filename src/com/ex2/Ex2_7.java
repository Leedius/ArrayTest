//Math.random(); 이라는 메소드가 있다. 이 메소드는 0~1까지 사이의 실수중 램던한 수를 전달해준다.
//예를 들어 double d=Math.random();을 하면 0.0<=0<1중 임의의 실수 값이 d에 할당된다.
//이를 활용하여 정수형 변수 i에 50<=i<100의 임의의 정수를 저장해보라.(배열문제아님)

package com.ex2;

public class Ex2_7 {
    public static void main(String[] args) {

        double j=Math.random();
        int i;
        int min = 50, max = 100;

        j = j * 100;
        i = (int) j;

        while (i<50||i>=100) {
            j = Math.random();
            j = j * 100;
            i = (int) j;
        }
        if (i>=50&&i<100) {
            System.out.println(i);
        }
    }
}
