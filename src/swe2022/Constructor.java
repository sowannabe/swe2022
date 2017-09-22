package swe2022;

public class Constructor {

    private String firstName;
    private String lastName;
    public Constructor() {
        this(fname:"mike",lname:"m")
    }
    public Constructor(String fname){
        this(fname, lname:"m");
    }
    public Constructor(String fname. String lname){
        firstName = fname;
        lastName = lname;
    }
    public String getName(){
        return firstName + " " + lastName;
    }
}
