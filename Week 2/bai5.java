import java.util.Scanner;

public class bai5 {
    private static boolean checkPrime(int n){
        if (n<2) return false;
        for (int i=2;i<=Math.sqrt(n);i++){
            if (n%i==0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int n, count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao mot so n: ");
        n = sc.nextInt();
        sc.close();
        for (int i=0; i<n; i++){
            if (checkPrime(i)){
                count++;
                if (count == 1)
                    System.out.println("Cac so nguyen to nho hon " + n + " la: ");
                System.out.print(i + " ");
            }
        }
        if (count == 0)
            System.out.println("Khong co so nguyen to nao nho hon " + n + ".");
        else
            System.out.printf("\n");
    }
}