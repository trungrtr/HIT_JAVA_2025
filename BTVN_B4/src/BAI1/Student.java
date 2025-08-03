package BAI1;

public class Student {
    private String ten;
    private int namSinh;
    private String diaTri;
    private double tx1;
    private double tx2;
    private double kthp;
    private int soTietNghi;

    final static int namHienTai=2025;

    public Student(String ten, int namSinh, String diaTri, double tx1, double tx2, double kthp, int soTietNghi){
        this.ten=ten;
        this.namSinh=namSinh;
        this.diaTri=diaTri;
        this.tx1=tx1;
        this.tx2=tx2;
        this.kthp=kthp;
        this.soTietNghi=soTietNghi;
    }
    public void Tuoi(){
        int Tuoi=namHienTai-namSinh;
        System.out.println("Tuoi cua sinh vien bang "+ Tuoi);
    }
    public void GPA(){
        double GPA =tx1*0.1+tx2*0.2+kthp*0.5;
        System.out.println("Diem GPA = "+ GPA);
    }
    public String getTen(){
        return this.ten;
    }
    public void setTen(String ten){
        this.ten=ten;
    }
    public int getNamSinh(){
        return this.namSinh;
    }
    public void setNamSinh(int namSinh){
        this.namSinh=namSinh;
    }
    public double getTx1(){
        return this.tx1;
    }
    public void setTx1(int tx1){
        this.tx1= tx1;
    }
    public double getTx2(){
        return this.tx2;
    }
    public void setTx2(int tx2){
        this.tx2= tx2;
    }
    public double getKthp(){
        return this.kthp;
    }
    public void setKthp(int kthp){
        this.kthp= kthp;
    }
    public int getSoTietNghi(){
        return this.soTietNghi;
    }
    public void setSoTietNghi(int soTietNghi){
        this.soTietNghi=soTietNghi;
    }
    public int getTuoi(){
        return namHienTai-this.namSinh;
    }
    public double getGpa(){
        return tx1*0.1+tx2*0.2+kthp*0.5;
    }


}
