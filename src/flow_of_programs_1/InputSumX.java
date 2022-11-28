package flow_of_programs_1;

import java.util.Scanner;

public class InputSumX {
    public static void main(String[] args) {
        int i=0;
        int a=100;
        int n=0;
        while(i <= a){
            System.out.println("Enter the input");
            Scanner input = new Scanner(System.in);
            String user_input = input.next();
            if(!user_input.equals("x")){
                n = n + Integer.parseInt(user_input);
                System.out.println("Enter to continue or x to quit");
                i = i + 1;
            }
            else{
                System.out.println("You have chosen to quit");
                break;
            }

        }
        System.out.println("total time the user entered the value is "+n);
    }
}
