package first_java_2;

import java.util.Scanner;

public class SimpleInterestUserInput {
    public static void main (String args[])
    {
        float p, r,  t,  si;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Principle Amount: ");
        p = sc.nextFloat();
        System.out.println("Enter Rate: ");
        r = sc.nextFloat();
        System.out.println("Enter Time: ");
        t = sc.nextFloat();
        si  = (p*r*t)/100;
        System.out.println("Simple Interest is: " +si);
    }
}
