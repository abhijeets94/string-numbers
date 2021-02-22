import java.util.Scanner;
public class AddTwoNumbers {

    public static void main(String[] args){

        int n, sum = 0;
        int num[] = new int[100];    
        Scanner sc = new Scanner(System.in);
        System.out.println("Add number of terms to be added");
        n = sc.nextInt();
        for (int i=0; i<n; i++) {
            System.out.println("Enter number "+i);
            num[i] = sc.nextInt();
            sum = sum + num[i];
        }
        
        System.out.println("Result is "+sum);
        
    }
}