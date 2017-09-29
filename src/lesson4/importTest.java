package lesson4;

import lesson4.sample.imported;
import lesson4.StaticInnerClass.Class2.Class2Class1;

public class importTest {
    static public void main(String[] arg){
        System.out.println(lesson4.sample.imported.getText());//imported에 있는 정적메소드 불러오기.
        System.out.println(imported.getText());//위에 import lesson4.sample.imported; 이거 썼을때 가능.
        StaticInnerClass.Class2 c = new StaticInnerClass.Class2();
        Class2Class1 c2 = new Class2Class1();
    }
}
