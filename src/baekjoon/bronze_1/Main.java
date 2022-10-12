package baekjoon.bronze_1;

public class Main {

//    알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오. 단, 대문자와 소문자를 구분하지 않는다.
//
//    입력
//    첫째 줄에 알파벳 대소문자로 이루어진 단어가 주어진다. 주어지는 단어의 길이는 1,000,000을 넘지 않는다.
//
//            출력
//    첫째 줄에 이 단어에서 가장 많이 사용된 알파벳을 대문자로 출력한다. 단, 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력한다.

    public static void main(String[] args) {


        String str = "aAbcd";

        for (int i = 0; i < str.length(); i++) {

            int idx = str.charAt(i);//첫 글자의 유니코드

            System.out.println("idx:" + idx);
        }

        int a = 'a';
        int A = 'A';
        int z = 'z';

        System.out.println(a + " to char: " + (char) a);
        System.out.println("a:" + a);
        System.out.println("A:" + A);
        System.out.println(A + " to char: " + (char) A);

        String strUp = (char) A + "";
        String strLow = (char) a + "";

        System.out.println(strUp.equalsIgnoreCase(strLow));

        System.out.println("z:" + z);


    }
}
