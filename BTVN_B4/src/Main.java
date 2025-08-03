import BAI1.Student;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StudentsList studentList = new StudentsList();
        System.out.println("Nhập so luong sinh vien");
        int n= sc.nextInt();

        for(int i=0;i<n;i++){
            System.out.println("Stt "+ i);
            sc.nextLine();
            System.out.println("Nhập tên sinh viên:");
            String name = sc.nextLine();

            System.out.println("Nhập năm sinh:");
            int birthYear = sc.nextInt();

            sc.nextLine();

            System.out.println("Nhập địa chỉ:");
            String address = sc.nextLine();

            System.out.println("Nhập điểm TX1:");
            double tx1 = sc.nextDouble();

            System.out.println("Nhập điểm TX2:");
            double tx2 = sc.nextDouble();

            System.out.println("Nhập điểm KTHP:");
            double kthp = sc.nextDouble();

            System.out.println("Nhập số tiết nghỉ:");
            int soTietNghi = sc.nextInt();

            Student newStudent = new Student(name, birthYear, address, tx1, tx2, kthp, soTietNghi);
            studentList.addStudent(newStudent);
        }
        System.out.println("Nhap vi tri can lay thong tin");
        int i=sc.nextInt();
        studentList.gpaStudent(i);
        System.out.println("Nhap vi trí can sua thong tin ");
        int j=sc.nextInt();

        System.out.println("Nhập tên sinh viên:");
        String name = sc.nextLine();

        System.out.println("Nhập năm sinh:");
        int birthYear = sc.nextInt();

        sc.nextLine();

        System.out.println("Nhập địa chỉ:");
        String address = sc.nextLine();

        System.out.println("Nhập điểm TX1:");
        double tx1 = sc.nextDouble();

        System.out.println("Nhập điểm TX2:");
        double tx2 = sc.nextDouble();

        System.out.println("Nhập điểm KTHP:");
        double kthp = sc.nextDouble();

        System.out.println("Nhập số tiết nghỉ:");
        int soTietNghi = sc.nextInt();
        Student newStudent = new Student(name, birthYear, address, tx1, tx2, kthp, soTietNghi);
        studentList.suaThongTin(j,newStudent);

        System.out.println("Nhap vi trí can xoa thong tin");
        int k=sc.nextInt();
        studentList.xoaThongTin(k);




    }
}