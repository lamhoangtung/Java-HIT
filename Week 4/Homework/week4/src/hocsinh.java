import java.util.Scanner;

public class hocsinh {
    public String MaHocSinh, TenHocSinh;
    public int NamSinh, DiemToan, DiemAnh, DiemVan;

    Scanner sc = new Scanner(System.in);

    public hocsinh(){
        System.out.print("Nhap ma hoc sinh: ");
        this.MaHocSinh = sc.nextLine();
        System.out.print("Nhap ten: ");
        this.TenHocSinh = sc.nextLine();
        System.out.print("Nhap nam sinh: ");
        this.NamSinh = sc.nextInt();
        System.out.print("Nhap diem toan: ");
        this.DiemToan = sc.nextInt();
        System.out.print("Nhap diem van: ");
        this.DiemVan = sc.nextInt();
        System.out.print("Nhap diem anh: ");
        this.DiemAnh = sc.nextInt();
    }

    public void NoiTen(){
        System.out.println("Ten cua toi la " + this.TenHocSinh);
    }

    public void NoiTuoi(){
        System.out.println("Tuoi cua toi la " + (2018-this.NamSinh));
    }

    public float getDiemTB(){
        return (float) (this.DiemAnh+this.DiemToan+this.DiemVan)/3;
    }
}
