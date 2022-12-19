package first_java_2;
import java.util.Scanner;

public class CheckEven {
    public static String isEven(int num){
        if(num%2==0){
            return "Input Number is Even";
        } else{
            return "Input Number is Odd";
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter Any Number: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(isEven(a));
    }
}
