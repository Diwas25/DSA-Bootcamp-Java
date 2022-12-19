package first_java_2;

import java.util.Scanner;

public class GreetWithName {
    public static String GreetByName(String name){
        return "Hi Good Morning "+name;
    }
    public static void main(String[] args) {
        System.out.println("Enter Your Name: ");
        Scanner sc = new Scanner(System.in);
        String sname = sc.next();
        System.out.println(GreetByName(sname));
    }
}
