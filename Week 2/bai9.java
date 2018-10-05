import java.util.Scanner;

public class bai9 {
    private static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
    private static int lcm(int a, int b) {
        return a * (b / gcd(a, b));
    }
    public static void main(String[] args) {
        int x, y;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao so x: ");
        x = sc.nextInt();
        System.out.print("Nhap vao so y: ");
        y = sc.nextInt();
        sc.close();
        System.out.println("Uoc chung lon nhat cua " + x + " va " + y + " la " + gcd(x,y));
        System.out.println("Boi chung nho nhat cua " + x + " va " + y + " la " + lcm(x,y));
    }
}