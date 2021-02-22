import java.util.Scanner;
public class AddTwoNumbers {

    public static void main(String[] args){
        
        int num1, num2, sum;    
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1");
        num1 = sc.nextInt();
        System.out.println("Enter num2");
        num2 = sc.nextInt();
        sum = num1+num2;
        System.out.println("Result is "+sum);
        
    }
}