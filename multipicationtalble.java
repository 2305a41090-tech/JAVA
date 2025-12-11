import java.util.Scanner;
public class multipicationtalble {
    public static void main(String[]args){
        
    
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a the number :");
        int n=sc.nextInt();
        for(int i=0; i<=10; i++){
            System.out.println(n+"x"+i+"="+n*i);
        }

    }
}