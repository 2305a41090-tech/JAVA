/* 
import java.util.Scanner;
public class userinput {
    public static void main(String[]args){
       Scanner sc=new Scanner(System.in);
        System.out.print("enter the name");
        String str=sc.nextLine();
        System.out.println(str);
    }
    
}
    */
   import java.util.Scanner;
   public class userinput {
    public static void main(String[]args){
       Scanner sc=new Scanner(System.in);
       System.out.print("enter the a");
       int a=sc.nextInt();
       System.out.print("enter the b");
       int b=sc.nextInt();
       System.out.println("assign operation");
       char op =sc.next().charAt(0);
       if(op=='+'){
        int sum=a+b;
        System.out.println("addition is" +add);
       }
       else if(op=='-'){
        System.out.println("substration"+sub);
       }
        else if(op=='*'){
            System.out.println("mutlpication"+multi);
        }
        else if(op=='/'){
                System.out.println("divison"+divi);
            }
        }
       }
    



