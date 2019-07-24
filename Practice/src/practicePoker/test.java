package practicePoker;

import java.lang.reflect.Array;
import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        String [] f = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
        String [] s = {"♥","♠","♣","♦"};
        Card [] cards = new Card[52];
//        String b = Arrays.toString(a);
//        System.out.println(b);
        int index = 0;

        for (int i = 0; i < f.length; i++) {
            for (int j = 0; j < s.length; j++) {
                cards[index++]= new Card(s[j],f[i]);
            }

        }
        for (Card card : cards) {

            //当println（obj）输出对象是将调用valuOf后valuOf在调用toString方法
            System.out.println(card);
        }
    }
}
