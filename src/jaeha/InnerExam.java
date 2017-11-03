package jaeha;

public class InnerExam {
    class Cal{
        int value=0;
        public void plus(){
            value++;
        }
    }
    public static void main(String[] arg){
        InnerExam c1 = new InnerExam();
        InnerExam.Cal cal = c1.new Cal();
        cal.plus();
        System.out.println(cal.value);
    }
}
