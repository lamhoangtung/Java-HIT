import java.util.Scanner;

public class bai8 {
    
    public static void main(String[] args) {
        System.out.print("Nhap chuoi: ");
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        sc.close();
        int[] a = new int[256];
        for (int i = 0; i < s.length(); i++) {
            a[s.charAt(i)]++;
        }
        for (int i = 0; i < 256; i++) {
            if (a[i] > 0) {
                System.out.println("'" + (char) i + "' = " + a[i]);
            }
        }
    }
}