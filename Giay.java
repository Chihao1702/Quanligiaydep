package quanlygiaydep;
 
import java.util.Scanner; 
public class Giay extends Khogiaydep 
{
    public String Loaigiay;
    
    Scanner sc = new Scanner (System.in);
    public Giay (String TenSP,String MaSP,String LoaiSP,String Ngaynhap,double Dongia,double Soluong,String Loaigiay){
        super(TenSP, MaSP, LoaiSP, Ngaynhap, Dongia, Soluong);
        this.Loaigiay = Loaigiay;
}
@Override
public void nhap()
{
System.out.println("Nhap ma giay ");
MaSP = sc.nextLine();

System.out.println("Nhap loai giay ");
LoaiSP= sc.nextLine();

System.out.println("Nhap ngay nhap");
Ngaynhap = sc.nextLine();

System.out.println("Nhap don gia");
Dongia = sc.nextDouble();

System.out.println("Nhap so luong");
Soluong = sc.nextDouble();

System.out.println("Nhap loai giay");
Loaigiay = sc.nextLine();
}
@Override
   public double tst()
 {
return Soluong*Dongia;
}}
