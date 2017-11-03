package lesson7;

import java.util.Random;

public class LocalClassTest {
    static public void main(String[] arg){
        IntSequence seq = randomInts(3,5);
        System.out.println(seq.next());
        System.out.println(seq.next());
        System.out.println(seq.next());

    }
    private static Random generator = new Random();
    public  static IntSequence randomInts(int low, int high){
       return ()-> low + generator.nextInt(high-low+1);//low와 high는 자유변수 선언되는 순간부터 상수화.(캡쳐)

    }
}
