package jaeha;

public class InnerExam2 {
    static class Cal{
        int value = 0;
        public void plus(){
           value++;
        }
    }

    public static void main(String[] arg){
        InnerExam2.Cal cal = new InnerExam2.Cal();
        cal.plus();

    }
}
