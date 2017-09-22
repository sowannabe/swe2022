package swe2022;

public class ClassBase1 {
    static public void main(String[] arg){
        Constructor c = new Constructor ();
        System.out.println(c.getName());
        Constructor c1 = new Constructor (fname: "a");
        System.out.println(c.getName());
        Constructor c2 = new Constructor (fname:"a", lname)
        System.out.println(c.getName());
    }
}
