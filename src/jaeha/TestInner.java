package jaeha;

public class TestInner {
    int i;
    public TestInner(){
        System.out.println("바깥클래스의 생성자");
    }
    public void outMethod(){
        System.out.println("바깥클래스의 메소드");
    }
    public class Inner{
        int j;
        public Inner(){
            System.out.println("안쪽클래스의 생성자");
        }
        public void inMethod(){
            System.out.println("안쪽클래스의 메서드");
            System.out.println("안쪽메서드 바깥변수 i="+i);
        }
    }

    public static void main(String[] arg){
        TestInner t1 = new TestInner();
        t1.i=10;
        TestInner.Inner in = t1.new Inner();
        in.j=100;
        in.inMethod();
    }
}
