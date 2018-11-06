import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class lophoc {
    public String tenlop, malop;
    public int sohocsinh;
    public List<hocsinh> DanhSachHocSinh = new ArrayList<>();
    public hocsinh loptruong;

    Scanner sc = new Scanner(System.in);

    public lophoc(){
        System.out.print("Nhap ten lop: ");
        this.tenlop = sc.nextLine();
        System.out.print("Nhap ma lop: ");
        this.malop = sc.nextLine();
        System.out.print("Nhap so hoc sinh: ");
        this.sohocsinh = sc.nextInt();
        for (int i=0; i<this.sohocsinh; i++) {
            System.out.println("Nhap thong tin cua hoc sinh thu " + (i+1) + ":");
            hocsinh temp = new hocsinh();
            this.addStudent(temp);
        }
    }

    public int getSohocsinh(){
        return DanhSachHocSinh.size();
    }

    public String getTenLopTruong(){
        return loptruong.TenHocSinh;
    }

    public int countHSTBG5(){
        int count = 0;
        for (int i=0; i<getSohocsinh(); i++) if (this.DanhSachHocSinh.get(i).getDiemTB() > 5.0) count++;
        return count;
    }

    public void showNameStudentHighgestScore(){
        hocsinh hsdiemcaonhat =  Collections.max(this.DanhSachHocSinh, Comparator.comparing(s -> s.getDiemTB()));
        System.out.println("Hoc sinh co diem cao nhat la : " + hsdiemcaonhat.TenHocSinh);
    }

    public void showNameStudentLowestScore(){
        hocsinh hsdiemthapnhat =  Collections.min(this.DanhSachHocSinh, Comparator.comparing(s -> s.getDiemTB()));
        System.out.println("Hoc sinh co diem cao nhat la : " + hsdiemthapnhat.TenHocSinh);
    }

    public void addStudent(hocsinh temp){
        DanhSachHocSinh.add(temp);
    }

    public void deleteStudent(String msv) {
        for (int i = 0; i < getSohocsinh(); i++) {
            if (this.DanhSachHocSinh.get(i).MaHocSinh == msv) {
                DanhSachHocSinh.remove(i);
                return;
            }
        }
        System.out.println("Khong tim thay ma sinh vien " + msv);
    }
}
