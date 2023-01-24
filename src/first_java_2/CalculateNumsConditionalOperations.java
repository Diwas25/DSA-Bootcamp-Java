package first_java_2;

import java.util.Objects;
import java.util.Scanner;

public class CalculateNumsConditionalOperations {
    public static void main(String[] args) {
        int a,b,result;
        String ops="";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1 : ");
        a = sc.nextInt();
        System.out.println("Enter num2 : ");
        b = sc.nextInt();
        System.out.println("Enter Operation you want to perform : ");
        ops = sc.next();

        if(ops.equals("+")){
            result = a + b;
            System.out.println("Addition is : "+result);
        }
        else if(ops.equals("-")){
            result = a - b;
            System.out.println("Subtraction is : "+result);
        }
        else if(ops.equals("*")){
            result = a * b;
            System.out.println("Multiplication is : "+result);
        }
        else if(ops.equals("/")){
            result = a / b;
            System.out.println("Divide is : "+result);
        }
        else if(ops.equals("%")){
            result = a % b;
            System.out.println("Reminder is : "+result);
        }
        else{
            System.out.println("Invalid Operation");
        }
    }
}
