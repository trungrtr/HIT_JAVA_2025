import java.util.*;
public class B2_BTVN {
    public static boolean checkDoiXung(String s){
        int n=s.length();
        for(int i=0;i<n/2;i++){
            if(!s.substring(i,i+1).equalsIgnoreCase(s.substring(n-1-i,n-i))){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap chuoi ");
        String s=sc.nextLine();
        if(checkDoiXung(s)){
            System.out.println("Chuoi doi xung ");
            s=s.toUpperCase();
            System.out.println(s);

        }
        else{
            System.out.println("Chuoi khong doi xung ");
            s=s.toLowerCase();
            System.out.println(s);
        }
    }
}
