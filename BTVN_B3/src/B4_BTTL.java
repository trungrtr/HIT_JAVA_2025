import java.util.*;
public class B4_BTTL {
    public static int fibonacci (int n){
        if(n==1) return 1;
        else{
           return fibonacci(n-2)+fibonacci(n-1);
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(fibonacci(5));

    }
}
