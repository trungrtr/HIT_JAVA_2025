import java.util.*;
        public class Main{

           public static void main(String[] args){
               //BAI 1
               System.out.println("BAI 1");
               Scanner sc=new Scanner(System.in);
               System.out.println("Nhap ten");
               String Ten=sc.nextLine();
               System.out.println("Nhap chieu cao ");
               double Chieu_cao=sc.nextDouble();
               System.out.println("Nhap tuoi ");
               int tuoi=sc.nextInt();
                System.out.println("Xin chào " + Ten + " bạn "+  tuoi +" tuổi và cao "+ Chieu_cao+ " met");

                //BAI 2
               String name="Trung";
               int Tuoi = 19;
               double gpa=2.9;
               String lop="HTTT02";
               System.out.println("BAI 2:");
               System.out.println("Ten " + name + " Tuoi: "+ Tuoi + " lOP: "+lop+" GPA: "+gpa);

               //BAI 3
               System.out.println("BAI 3");
               int a,b;
               System.out.println("Nhap a: ");
               a=sc.nextInt();
               System.out.println("Nhap b: ");
               b=sc.nextInt();
               System.out.println("a + b = "+ (a+b));
               System.out.println("a - b = "+ (a-b));
               System.out.println("a * b = "+ (a*b));
               System.out.println("a / b = "+ (a/b));
               System.out.println("a % b = "+ (a%b));
               if(a==b){
                   System.out.println("a = b");
               }
               else if(a<b)
                   System.out.println("a<b");
               else System.out.println("a>b");
           }

        }