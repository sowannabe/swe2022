package swe2022;

public class Parent {

    private String name = "";

    public String mutator(String v){
        name += v;
        return name;
    }
    public String getName(){
        return name;
    }


    public String action(){
        return "parent";
    }
}

