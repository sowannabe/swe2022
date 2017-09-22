package swe2022;

import java.util.ArrayList;

public class Constructor {


    String firstName;
    private String lastName;
    String seperator;
    private ArrayList<String> friends;
    {
        seperator = " ";
    }
    {
        friends = new ArrayList<>();
        friends.add("mike");
        friends.add("jane");
    }

    public Constructor(){
        this("john", "doe");
    }
    public Constructor(String fname){
        this(fname, "doe");
    }
    public Constructor(String fname, String lname){
        firstName = fname;
        lastName = lname;
    }
    public String getName(){
        return firstName + seperator + lastName;
    }
    public String getFriend(int index){
        return this.friends.get(index) + " is " + this.getName() + "'s friend";
    }
}
