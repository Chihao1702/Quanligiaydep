package quanlygiaydep;

import java.util.Scanner;

public class Dep extends Khogiaydep 
{
    public String Loaidep;   
    Scanner sc = new Scanner (System.in);
    public Dep (String TenSP,String MaSP,String LoaiSP,String Ngaynhap,double Dongia,double Soluong,String Loaidep){
        super(TenSP, MaSP, LoaiSP, Ngaynhap, Dongia, Soluong);
        this.Loaidep = Loaidep;
}
@Override
public void nhap()
{
System.out.println("Nhap ma dep");
MaSP = sc.nextLine();

System.out.println("Nhap loai san pham");
LoaiSP= sc.nextLine();

System.out.println("Nhap ngay nhap");
Ngaynhap = sc.nextLine();

System.out.println("Nhap don gia");
Dongia = sc.nextDouble();

System.out.println("Nhap so luong");
Soluong = sc.nextDouble();

System.out.println("Nhap loai dep");
Loaidep = sc.nextLine();
}
@Override
   public double tst(){
return Soluong*Dongia;
}
}