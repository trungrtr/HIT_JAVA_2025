import java.util.*;

public class B5_BTTL {

    public static void matrix(int[][] a, int n) {
        int value = 1;
        int top = 0, bottom = n - 1, left = 0, right = n - 1;

        while (top <= bottom && left <= right) {
            // Từ trái qua phải
            for (int i = left; i <= right; i++) {
                a[top][i] = value;
                value++;
            }
            top++;

            // Từ trên xuống dưới
            for (int i = top; i <= bottom; i++) {
                a[i][right] = value;
                value++;
            }
            right--;

            if (top <= bottom) {
                // Từ phải sang trái
                for (int i = right; i >= left; i--) {
                    a[bottom][i] = value;
                    value++;
                }
                bottom--;
            }

            if (left <= right) {
                // Từ dưới lên trên
                for (int i = bottom; i >= top; i--) {
                    a[i][left] = value;
                    value++;
                }
                left++;
            }
        }
    }

    public static void xuat(int[][] a, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void tong_ChinhVaPhu(int[][] a,int n){
        int sumC=0,sumP=0;
        int top=0,right=n-1,left=0,bottom=n-1;
        while(top<=bottom && left<=n-1&&right>=0){
            sumP+=a[top][right];
            sumC+=a[top][left];
            top++;
            right--;
            left++;
        }
        System.out.println("Tong cac phan tu tren duong cheo chinh la "+ sumC);
        System.out.println("Tong cac phan tu tren duong cheo phu la "+ sumP);


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n: ");
        int n = sc.nextInt();
        int[][] a = new int[n][n];
        matrix(a, n);
        xuat(a, n);
        tong_ChinhVaPhu(a,n);
    }
}
