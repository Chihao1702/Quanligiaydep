package quanlygiaydep;

public abstract class Khogiaydep {
   String TenSP;
   String MaSP;  
   String LoaiSP;
   String Ngaynhap;
   double Dongia;
   double Soluong;
    
        public String getTenSP(){
            return TenSP;
        }
        public String getMaSP(){
            return MaSP;
        }      
        public void setTenSP(String TenSP){
            this.TenSP = TenSP;
        }
        public void setMaSP(String MaSP){
            this.MaSP = MaSP;
        }
        public String getLoaiSP(){
            return LoaiSP;
        }
        public void setLoaiSP (String LoaiSP){
            this.LoaiSP = LoaiSP;
        }
        public String getNgaynhap(){
            return Ngaynhap;
        }
        public void setNgaynhap(String Ngaynhap){
                this.Ngaynhap = Ngaynhap;
        }
        public double getDongia(){
            return Dongia;
        }
        public void setDongia(double Dongia){
            this.Dongia = Dongia;
        }
          public double getSoluong(){
            return Soluong;
        }
          public void setSoluong(double Soluong){
            this.Soluong = Soluong;
        }
          
        
        public Khogiaydep(String TenSP,String MaSP,String LoaiSP,String Ngaynhap,double Dongia,double Soluong){
            this.TenSP = TenSP;
            this.MaSP = MaSP;
            this.LoaiSP = LoaiSP;
            this.Ngaynhap = Ngaynhap;
            this.Dongia = Dongia;
            this.Soluong = Soluong;
        }
        public abstract void nhap();
        public abstract double tst();      
}