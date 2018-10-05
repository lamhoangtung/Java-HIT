import java.util.Scanner;

public class bai4 {
    private static boolean checkSquareNum(int n) {
        double sqrt = Math.sqrt(n);
        int x = (int) sqrt;
        if (Math.pow(sqrt, 2) == Math.pow(x, 2))
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so nguyen duong a: ");
        a = sc.nextInt();
        sc.close();
        System.out.println("Cac so chinh phuong nho hon " + a + " la: ");
        for (int i=0; i<a; i++){
            if (checkSquareNum(i)){
                System.out.print(i + " ");
            }
        }
        System.out.printf("\n");
    }
}