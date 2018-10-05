import java.util.Scanner;

public class bai4 {
    private static boolean checkPrime(int n){
        if (n<2) return false;
        for (int i=2;i<=Math.sqrt(n);i++){
            if (n%i==0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao mot so nguyen duong n: ");
        n = sc.nextInt();
        if (checkPrime(n)){
            System.out.println(n + " la so nguyen to.");
        }
        else{
            System.out.println(n + " khong phai la so nguyen to.");
        }
    }
}