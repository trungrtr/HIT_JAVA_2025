import java.util.*;
public class B3_BTVN {
    public static void main(String[] args){
        Random rd=new Random();
        Scanner sc= new Scanner(System.in);
        int a=rd.nextInt(101);
        int b=rd.nextInt(101);
        //int c=rd.nextInt(201);
        int sum=a+b;
        boolean check=rd.nextBoolean();
        int c;
        if(check){
            c=sum;
        }
        else {
            c=rd.nextInt(201);
            if(c==sum){
                while(c==sum){
                    c=rd.nextInt(201);
                }
            }
        }
        System.out.println(a +" + " + b +" = "+c);
        System.out.println("Nhap cau tra loi cua ban ");
        String s=sc.nextLine();
        if(s.equalsIgnoreCase("Correct") && check){
            System.out.println("Ban da tra loi dung ");

        }
        else if(s.equalsIgnoreCase("Correct")&& !check){
            System.out.println("Ban da tra loi sai ");

        }
        else if(s.equalsIgnoreCase("Incorrect")&& check){
            System.out.println("Ban da tra loi sai ");
        }
        else if(s.equalsIgnoreCase("Incorrect")&& !check)
            System.out.println("Ban da tra loi dung ");
    }
}
