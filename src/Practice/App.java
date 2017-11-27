package Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class App {
    ArrayList<TodoList> todoLists;

    public App(){
        this.todoLists = new ArrayList<>();
    }


    public void addList(TodoList newList){
        todoLists.add(newList);
    }

    public void removeList(TodoList list){
        if(!(todoLists.isEmpty())
            && todoLists.contains(list))
          todoLists.remove(list);
    }

    public String getList(){
        if(todoLists.isEmpty()) return "리스트를 추가해 주세요";
        else return todoLists.toString();
    }
    private String name;
    private String color;

    public void getName(String name){
        this.name= name;
        ArrayList<String> newName = new ArrayList<>();


    }



    public boolean getDirection(){
        return true;

    }

    public void getTheme(String color){
        this.color=color;
    }



}
