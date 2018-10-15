// Hoàng Tùng Lâm - KHMT1 - K12
import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chuoi: ");
        String str = sc.nextLine();
        str = str.trim();
        String[] str_arr = str.split(" ");
        str = "";
        for (int index=0; index < str_arr.length; index++){
            int word_length = str_arr[index].length();
            if (word_length!=3){
                if (word_length==4){
                    str += str_arr[index].substring(0,1).toUpperCase() + str_arr[index].substring(1) + " ";
                }
                else if (word_length==5){
                    str += str_arr[index].substring(0,word_length-1) + str_arr[index].substring(word_length-1).toUpperCase() + " ";
                }
                else{
                    str += str_arr[index] + " ";
                }
            }
        }
        System.out.println("Chuoi sau khi da xu ly la: " + str);
    }
}