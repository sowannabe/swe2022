package lesson6;
//141p runnable

import java.util.Comparator;

public class Main {
    static class Run implements Runnable{

        @Override
        public void run() {
            for(int i = 0; i <100; i++) Main.doWork();
        }
        /*
        private void doWork() {
        }
        */
     static class Run2 implements Runnable{

            @Override
            public void run() {
                for(int i = 0; i<2000;i++) Main.doWork();
            }
        }
    }
    static class LengthComparator implements Comparator<String> {

        @Override
        public int compare(String first, String second) {
            return first.length()-second.length();
        }
    }


    static void doWork(){}
    static void main(String[ ] arg){
        Runnable task = new Run();//이게 중첩클래스
        Runnable task2 = ()->{
            for(int i = 0; i<2000; i++) doWork();
        };//위랑 같은 것을 람다로 구현하는 식.
        Comparator<String> comp1 = new LengthComparator();
        Comparator<String> comp2 = (f,s)->f.length()-s.length();
        comp2.compare();// 이걸 불러오기 전까지 코드 실행 지연이 일어난다.

        Employee me = new Employee(), you = new Employee();
        Employee[] members =
    }
}
