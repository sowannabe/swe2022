package swe2022;

public class ClassBase0 {
    static public void main(String[] arg){
        Parent parent = new Child();

        System.out.println(parent.action());

        parent.mutator("abc");
        System.out.println(parent.getName());
        parent.mutator("123");
        System.out.println(parent.getName());
        System.out.println(parent.getName());
        System.out.println(parent.getName());

        String a = "abcd";
        System.out.println(a.length());
        /*
        String b = null;
        System.out.println(b.length());
        */
        a = null;
    }
}
