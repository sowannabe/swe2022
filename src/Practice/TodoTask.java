package Practice;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class TodoTask extends TodoList {

    public void add(String task){
        int year = 0;
        int month = 0;
        LocalDate date = LocalDate.of(year, month, 1);

        while (date.getMonthValue() == month){
            System.out.printf("%4d", date.getDayOfMonth());
            date = date.plusDays(1);
        }

        DayOfWeek weekday = date.getDayOfWeek();

        int value = weekday.getValue();
        for(int i =1; i<value;i++){
            System.out.print("  ");
        }

    }




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
