package lesson4;

import lesson4.sample.imported;

public class StaticInnerClass {
    private static class Class1{
        Class1(){
            System.out.println(imported.getText());//나만 알고 싶은 클래스-private 선언
        }
    }
    static class Class2{
            static class Class2Class1{}
    }
    static public void main(String[] arg){
        Class1 c = new Class1();// full name- lesson4.StaticInnerClass.Class1 c = new StaticInnerClass.Class1();
        System.out.println(imported.getText());
    }
}
