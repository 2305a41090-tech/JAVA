/* 
public class string {
    public static void main(String[]args){
        StringBuilder sb=new StringBuilder("Hello");
        
        sb.append("World");
        System.out.println(sb.reverse());
    }

    }
    */
   public class string {
    public static void main(String[]args){
        StringBuilder sb=new StringBuilder("Hello");
        if(sb==sb.reverse()){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
    }
}
        
        

