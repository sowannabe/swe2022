package swe2022;

public class NoConst {
    public String getFirstName(Constructor c){
        return c.firstName.substring(0,2) + "...";
    }
}
