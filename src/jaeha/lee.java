package jaeha;

import java.util.Scanner;
//import java.util.Random;

public class lee {
    public static void main(String[] args) {
        String input;
        Scanner scanner = new Scanner(System.in);
        System.out.print("input something");
        input = scanner.nextLine();
        boolean done = false;
        while(!done){
            input = scanner.nextLine();
            if("Q".equals(input)){
                done = false;
            }
            else{
                System.out.println(input);

            }

        }


        }
}