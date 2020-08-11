
package calculator;

import java.util.Scanner;

/**
 *
 * @author A
 */
public class MainClass {
    
    
    
    public static void main(String args[]){
       
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter x :");
        int x=sc.nextInt();
        
         System.out.print("Enter y ;");
         int y = sc.nextInt();
         
         System.out.print("Enter the operation(+,-,*,/,%) :");
         String op=sc.next();
         int c =0;
         
         Calculator cl= new Calculator(x,y);
         switch (op){
             case "+" :c =cl.add(); break;
             case "-" : c = cl.sub();break;
             case "*" : c=cl.multiply(); break;
             case "/" :c= cl.divide(); break;
             case "%" : c=cl.modulus(); break;
             default:  System.out.println("invalid entry");
             
             
             
         }
                 System.out.println("The Result is : "+ "=" +c);

    }
}
