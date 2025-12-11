/* 
import java.util.Random;
import java.util.Scanner;
public class guessnumber{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        Random rc=new Random();
        int x=rc.nextInt(100);
        int num=0;
        while(x!=num){
            System.out.print("Guess the number:");
            num=sc.nextInt();
            if(num<x){
                System.out.println("My number is greater than you guess");
            }
             else if(num>x){
                System.out.println("My number is less than you guess");
            }
            else if(num==x){
                System.out.println("your guess is correct");

            }
            else{
                System.out.println("Invalid input");
                break;
            }
            }
        }



    }
        */
       import java.util.Random;
import java.util.Scanner;
public class guessnumber{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        Random rc=new Random();
        int x=rc.nextInt(100);
        int num=0;
        int count=0;
        while(x!=num){
            System.out.print("Guess the number:");
            num=sc.nextInt();
            if(num<x){
                System.out.println("My number is greater than you guess");
                count++;
            }
             else if(num>x){
                System.out.println("My number is less than you guess");
                count++;
                

            }
            else if(num==x){
                System.out.println("your guess is correct");
                count++;
                System.out.println("No.Of attempts: "+count);

            }
            else{
                System.out.println("Invalid input");
                break;
            }
            }
        }



    }
        
       


