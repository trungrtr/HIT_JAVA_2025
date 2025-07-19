import java.util.*;
public class BAI_5 {
    public static void bcc(){
        for(int i=1;i<=10;i++){
            System.out.println("5 x "+ i + " = " + 5*i);
        }
    }
    public static void sum_chan(){
        int sum=0;
        for(int i=1;i<=100;i++){
            if(i%2==0){
                sum+=i;
            }
        }
        System.out.println("Tong cac so chan tu 1 den 100 bang for = "+ sum);
    }
    public static void sum_chan_w(){
        int sum=0;
        int i=1;
        while(i<=100){
            if(i%2==0){
                sum+=i;
            }
            i++;
        }
        System.out.println("Tong cac so chan tu 1 den 100 bang while = "+sum);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        bcc();
        sum_chan();
        sum_chan_w();
    }
}
