import java.util.Random;
import java.util.Scanner;
public class miniproject{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random rc = new Random();
        int Akshitha=rc.nextInt(1000);
        int suswaran=rc.nextInt(1000);
        int vidhu=rc.nextInt(1000);
        int usha=rc.nextInt(1000);
        System.out.print("Enter your age to vote: ");
        int age=sc.nextInt();
        if(age>=18){
            System.out.println("You are eligible to vote.");
            System.out.println("Candidates List");
            System.out.println("1. Akshitha");
            System.out.println("2. Suswaran");
            System.out.println("3. vidhu");
            System.out.println("4. usha");
            System.out.println("");
            System.out.print("Enter the candidate number you want to vote for: ");

            int vote=sc.nextInt();
            if(vote==1){
                Akshitha++;
                System.out.println("Your voting is successful!");
            }
            else if(vote==2){
                suswaran++;
                System.out.println("Your voting is successful!");
            }
            else if(vote==3){
                vidhu++;
                System.out.println("Your voting is successful!");
            }
            else if(vote==4){
                usha++;
                System.out.println("Your voting is successful!");
            }
            else{
                System.out.println("Invalid candidate number.");
            }
         }
        else{
            System.out.println("You are not eligible to vote.");
        }
        System.out.println("Voting Results:");
        System.out.println("Total votes for Akshitha: " + Akshitha);
        System.out.println("Total votes for Suswaran: " + suswaran);
        System.out.println("Total votes for Vidhu: " + vidhu);
        System.out.println("Total votes for usha: " + usha);

        if(Akshitha>suswaran && Akshitha>vidhu && Akshitha>usha){
            System.out.println("Akshitha is the winner!!");
        }
        else if(suswaran>Akshitha && suswaran>vidhu && suswaran>usha){
            System.out.println("Suswaran is the winner!!");
        }
        else if(vidhu>Akshitha&& vidhu>suswaran && vidhu>usha){
            System.out.println("vidhu is the winner!!");
        }
        else if(usha>Akshitha && usha>suswaran && usha>vidhu){
            System.out.println("usha is the winner!!");
        }
        else{
            System.out.println("It's a tie!");
        }
    }
}