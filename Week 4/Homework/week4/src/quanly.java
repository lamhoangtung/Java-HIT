import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class quanly {
    public List<lophoc> DanhSachLopHoc = new ArrayList<>();

    public void addClass(lophoc temp){
        DanhSachLopHoc.add(temp);
    }

    public void deleteClass(String malop){
        for (int i=0; i<DanhSachLopHoc.size();i++){
            if (DanhSachLopHoc.get(i).malop == malop) {
                DanhSachLopHoc.remove(i);
                return;
            }
        }
        System.out.println("Khong tim thay ma lop " + malop);
    }

    public void countStudentInEachClass(){
        for (int i=0; i<DanhSachLopHoc.size(); i++){
            System.out.println("Lop " + (i+1) + " co " + DanhSachLopHoc.get(i).getSohocsinh() + " hoc sinh.");
        }
    }

    public float avgPointOfAllStudent(){
        float avg = 0;
        for (int i=0; i<DanhSachLopHoc.size(); i++){
            avg += MATH.avg_class(DanhSachLopHoc.get(i));
        }
        avg /= DanhSachLopHoc.size();
        return avg;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        quanly manager = new quanly();
        while (true){
            System.out.print("Nhap y de them lop, n de ket thuc: ");
            char c = sc.next().charAt(0);
            if (c == 'y'){
                lophoc temp = new lophoc();
                manager.addClass(temp);
            }
            else if (c == 'n') break;
        }
        System.out.println("Diem trung binh cua toan bo sinh vien la: " + manager.avgPointOfAllStudent());
        manager.countStudentInEachClass();
    }
}


