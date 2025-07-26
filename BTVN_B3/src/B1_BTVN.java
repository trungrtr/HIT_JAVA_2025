import java.util.*;
public class B1_BTVN {
    public static class hinhDang{
        public static final double square=3.0;
        public static final double triangule=2.0;
        public static final double circle=1.0;


    }
    public static void check(double type){
        if( type==hinhDang.square){
            System.out.println("Dien tich hinh vuong la "+ type*type);
        }
        else if(type==hinhDang.triangule){
            System.out.println("Dien tich hinh tam giac la "+ 1/2*((type/2)*Math.sqrt(Math.pow(type,2)-Math.pow(type/2,2))));
        }
        else if(type==hinhDang.circle){
            System.out.println("Dien tich hinh tron la "+ Math.PI*type*type);
        }
        else {
            System.out.println("Hinh dang ko hop le");
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap type");
        double type=sc.nextDouble();
        check(type);


    }
}
