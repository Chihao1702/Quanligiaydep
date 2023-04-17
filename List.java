package quanlygiaydep;
 
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator; 
import java.util.Scanner;

public class List {
   
    ArrayList<Khogiaydep> list = new ArrayList<>();
    ArrayList<Khogiaydep> xuatlist = new ArrayList<>();
    String  TenSP,LoaiSP,ngaynhap,loaigiay,tendep,maSP;
    Scanner sc = new Scanner(System.in);
    double Dongia,Soluong;
    
    public void nhap()
    {
        do
        {
            System.out.print("nhap ten san pham :");
            Scanner sc = new Scanner(System.in);
            String TenSP = sc.nextLine();
            if(TenSP == null||TenSP.equals(""))
            {
                break;
            }
            System.out.print("nhap loai san pham (1 giay || 2 dep ||):");
            String LoaiSP = sc.nextLine();
            if(LoaiSP == null||LoaiSP.equals(""))
            {
                break;
            }
            else if(LoaiSP.equalsIgnoreCase("1"))
            {
               Khogiaydep Khogiaydep = new Giay (TenSP, maSP, LoaiSP, ngaynhap, Dongia, Soluong, loaigiay);
               Khogiaydep.nhap();
               list.add(Khogiaydep);
            }
            else if(LoaiSP.equalsIgnoreCase("2"))
            {
               Khogiaydep Khogiaydep = new Dep(TenSP, maSP, LoaiSP, ngaynhap, Dongia, Soluong, LoaiSP);
               Khogiaydep.nhap();
               list.add(Khogiaydep);
            }      
        }
       while(true); 
    }
    public void xuat()
    {
        int i=0;
        for(Khogiaydep Khogiaydep : list)
        {
            i++ ;
  System.out.printf(" %d: TenKhogiaydep %s || MaKhogiaydep %s || LoaiKhogiaydep %s || Dongia %s || Ngaynhap %s || Soluong %s || tongsotien %f \n ", i ,Khogiaydep.getTenSP(),Khogiaydep.getMaSP(),Khogiaydep.getLoaiSP(),Khogiaydep.getDongia(),Khogiaydep.getNgaynhap(),Khogiaydep.getSoluong(),Khogiaydep.tst());
        }     
    }
    public void timkiem()
    {
        if(list.size()>0)
        {
        int i=0;
        Scanner sc = new Scanner(System.in);
        String tk= sc.nextLine();
        for(Khogiaydep Khogiaydep : list)
        {
            i ++;
            if(Khogiaydep.getTenSP().equalsIgnoreCase(tk))
            {
                System.out.printf("ten SP can tim kiem ; %d : %s \n", i, Khogiaydep.getTenSP());
            }
        }
    }
    else
    {
        System.out.println("hien tai danh sach dang trong vui long nhap du lieu truoc khi tim kiem");
    }
    }
public void xoa()
{
    if(list.size()>0)
    {
        System.out.println("nhap ten can xoa");
        Scanner sc = new Scanner(System.in);
        String tk= sc.nextLine();
        Khogiaydep khogiaydeptim= null;
        for(Khogiaydep Khogiaydep : list)
        {
            if(Khogiaydep.getMaSP().equalsIgnoreCase(tk))
            {
                khogiaydeptim = Khogiaydep;
            }                                        
            break;
        }
        if(khogiaydeptim != null)
        {
            xuatlist.add(khogiaydeptim);
            list.remove(khogiaydeptim);
            System.out.println("Xoa thanh cong");
        }
    }
    else
    {
        System.out.println("hien tai danh sach dang trong vui long nhap du lieu truoc khi thay doi");
    }
}
 public void sapxepaphalbet()
 {
     Collections.sort(list, new Comparator<Khogiaydep>()
     { 
         @Override
         public int compare(Khogiaydep s1,Khogiaydep s2)
         {
             return String.valueOf(s1.getTenSP()).compareTo(s2.getTenSP());
         }
 });
     System.out.println("sap xep thanh cong");
     xuat();
 }
  public void xoa1()
  {
      if(list.size()>0)
      {
          System.out.println("Nhap ten can xoa");
          Scanner sc = new Scanner(System.in);
        String tk = sc.nextLine();
        Khogiaydep khogiaydeptim= null;
        for(Khogiaydep Khogiaydep : xuatlist)
        {
            if(Khogiaydep.getMaSP().equalsIgnoreCase(tk))
            {
                khogiaydeptim = Khogiaydep;
            }
            break;
        }
        if(khogiaydeptim != null)
        {
            list.add(khogiaydeptim);
            xuatlist.remove(khogiaydeptim);
            System.out.println("Xoa thanh cong");
        }         
        }
      else
      {
          System.out.println("hien tai danh sach dang trong vui long nhap du lieu truoc khi thay doi");
      }
  }
  public void tongsotien()
  {
      double tong = 0;
      for (Khogiaydep khogiaydep : list)
      {
          tong = tong + khogiaydep.tst();
      }
      System.out.println("tong so tien nhap kho la: "+tong);
  }
      Comparator<Khogiaydep> sx = new Comparator<Khogiaydep>()
  {
  @Override
  public int compare(Khogiaydep o1 ,Khogiaydep o2)
  {
      return Double.compare(o1.tst(),o2.tst());
  }
};
 public void sapxeptst()
 {
     Collections.sort(list, sx);
     System.out.println("sap xep tang dan theo tong so tien");
     xuat();
 }
 public void danhsachxuatkho()
 {
   for (Khogiaydep khogiaydep : list)  
   {
       System.out.println("\" %d: TenKhogiaydep %s || MaKhogiaydep %s || LoaiKhogiaydep %s || Dongia %s || Ngaynhap %s || Soluong %s || tongsotien %f \\n \", i ,Khogiaydep.getTenSP(),Khogiaydep.getMaSP(),Khogiaydep.getLoaiSP(),Khogiaydep.getDongia(),Khogiaydep.getNgaynhap(),Khogiaydep.getSoluong(),Khogiaydep.tst()");
   }
 }
 public void thaydoi()
 {
     if(list.size()>0)
     {
         System.out.println("nhap ten can thay doi");
         Scanner sc = new Scanner(System.in);
         String tk = sc.nextLine();
         Khogiaydep khogiaydeptim= null;
        for(Khogiaydep Khogiaydep : list)
        {
            if(Khogiaydep.getMaSP().equalsIgnoreCase(tk))
            {
                khogiaydeptim = Khogiaydep;
            }
            break;
        }
        if(khogiaydeptim != null)
        {
            list.add(khogiaydeptim);
            khogiaydeptim.nhap();
            xuatlist.remove(khogiaydeptim);
        }
     }
     else
     {
         System.out.println("hien tao danh sach dang trong vui long nhap du lieu truoc khi thay doi");
     }
 }
  public void menu()
  {
      int chon;
      do
  {
         System.out.println("1:--- nhap du lieu");
         System.out.println("2:--- danh sach nhap kho");
         System.out.println("3:--- tim kiem");
         System.out.println("4:--- xoa 1 sp nhap kho");
         System.out.println("5:--- sap xep du lieu theo thu tu aphalbet");
         System.out.println("6:--- sap xep theo tong so tien");
         System.out.println("7:--- danh sach xuat kho");
         System.out.println("8:--- xoa 1 sp xuat kho");
         System.out.println("9:--- tong so tien giay dep trong kho");
         System.out.println("10:--- thay doi du lieu");
         System.out.println("0:--- thoat");
         chon =sc.nextInt();
         
         if(chon !=0)
         {
             switch(chon)
         {
             case 1: nhap();break;
             case 2: xuat();break;
             case 3: timkiem();break;
             case 4: xoa();break;
             case 5: sapxepaphalbet();break;
             case 6: sapxeptst();break;
             case 7: danhsachxuatkho();break;
             case 8: xoa1();break;
             case 9: tongsotien();break;
             case 10: thaydoi();break;            
         }
       }
     }
  while(chon!=0);
}
}
