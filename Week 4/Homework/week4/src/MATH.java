public class MATH {
    public static float avg_student(hocsinh temp){
        float avg = 0;
        avg += temp.DiemToan + temp.DiemVan + temp.DiemAnh;
        avg /= 3;
        return avg;
    }

    public static float avg_class(lophoc temp){
        float avg = 0;
        for (int i=0; i< temp.getSohocsinh(); i++){
            avg += avg_student(temp.DanhSachHocSinh.get(i));
        }
        avg /= temp.getSohocsinh();
        return avg;
    }
}
