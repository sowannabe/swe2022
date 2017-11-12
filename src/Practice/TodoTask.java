package Practice;

import java.util.Scanner;

public class TodoTask extends TodoList {
    public static void main(String[] arg){
        TodoTask name = new TodoTask();
        Scanner in =new Scanner(System.in);
        int i;
        for(i=0;i<=1000;i++){
            System.out.println("What is your name?");
            String fullname = in.nextLine();

            name.getName("soemthing");


        }


    }


}
