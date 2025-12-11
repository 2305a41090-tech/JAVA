import java.util.Scanner;
public class fibbonacci {
    public static void main(String[]args){
        Scanner sc=new Scanner (System.in);
        int n=10;
    System.out.println("Fibbonacci series upto "+n+" terms:");
    for(int i=1; i<=n; i++){
     System.out.print(series(i)+" ");
    }
       
}
    public static int series(int n){
        if(n==1){
            return 0;
        }
        if(n==2){
            return 1;
        }
        if(n==3){
            return 1;
        }
        else{
            return series(n-1)+series(n-2);
        
    }
}
}

    
    

