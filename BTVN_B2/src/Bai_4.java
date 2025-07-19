import java.util.*;
public class Bai_4{
    public static int gtln(int[] arr){
        int max=arr[0];
        for(int i=0;i<5;i++){
        if(arr[i]>max){
            max=arr[i];
        }
        }
        return max;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Cac phan tu vua nhap la: ");
        for(int i=0;i<5;i++){
            System.out.println(arr[i]);
        }
        System.out.println("Tong cac phan tu la :");
        int sum=0;
        for(int i=0;i<5;i++){
            sum+=arr[i];
        }
        System.out.println(sum);
        System.out.println("GIA TRI MAX: ");
        System.out.println(gtln(arr));
    }
}
