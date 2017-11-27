package Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TodoList{
    private String listName;
    ArrayList<Todotask> todoTasks = new ArrayList<>();
    private TodoTheme listTheme;
    boolean listSorted;

    public TodoList(String listname){
        this.listName=listname;
        this.todoTasks = new ArrayList<Todotask>();
        this.listSorted = false;
        this.listTheme=new TodoTheme();
    }

    public void setListName(String newName){
        this.listName=newName;
    }

    public Object getName(){
        return listName;
    }

    public enum sorting {CHR, REVERSE_CHR, DEADLINE,REVERSE_DEADLINE, CREATINGTIME, REVERSE_CREATINGTIME, COMPLETED, REVERSE_COMPLETED};

}