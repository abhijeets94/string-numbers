import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class AddTwoNumbers {

    public static void main(String[] args){
 
        int result = 0 ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers to be added seperated by ',' ");
        String num = sc.nextLine();
        String[] numArray = num.split(",");


      try{
              for (int i=0;i<numArray.length;i++) {
                    result = result + Integer.parseInt(numArray[i]);
                }
            }
           catch(Exception e) {
               System.out.println("");
           }

           if (result >=1000) {
               result = result-1000;

           }
           
            System.out.println("Result is "+result );  
        sc.close();
    }}