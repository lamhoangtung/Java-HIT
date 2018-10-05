import java.util.Scanner;

public class bai7 {
    private static double F(int n) {
        double res=0;
        if (n%2 == 0){
            for (int i=1;i<=n;i++){
                res += (1.0/i);
            }
        }
        else{
            res = Math.sqrt(n - 1);
        }
        return res;
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao mot so nguyen n: ");
        n = sc.nextInt();
        sc.close();
        System.out.println("F(" + n + ") = " + F(n));
    }
}