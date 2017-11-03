package jaeha;
//파이썬에서의 input과 같은 실행하기.

import java.util.Scanner;

public class eihg {
    public static void main(String[] args){
        String name;
        int age;
        Scanner in = new Scanner(System.in);
        System.out.print("What is your name? ");
        name = in.nextLine();
        System.out.print("How old are you? ");
        age = in.nextInt();
        if(age > 25){
            System.out.printf("Hello %s. Next Year, you'll be fucking %d years old.",name,age);
    }
        else{
            System.out.printf("Hello %s. Next Year, you'll be %d years old.",name,age);
        }


}
}
