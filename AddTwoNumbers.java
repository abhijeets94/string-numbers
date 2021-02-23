import java.util.Scanner;

import javax.swing.JOptionPane;
public class AddTwoNumbers {

    public static void main(String[] args){
 
        int result = 0 ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers to be added");
        String num = sc.nextLine();
        String[] numArray = num.split(",");

        for (int i=0;i<numArray.length;i++) {
            result = result + Integer.parseInt(numArray[i]);
        }
   
        System.out.println("Result is "+result );   
        sc.close();
    }}