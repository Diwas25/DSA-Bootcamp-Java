package flow_of_programs_1;

import java.util.Scanner;

public class PrintTableWIthUserInput {
    public static void main(String arg[])
    {
        // Change here to change output
        System.out.println("Give a number to print the table");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= 10; ++i)
            System.out.println(n + " * " + i +" = " + n * i);
    }
}
