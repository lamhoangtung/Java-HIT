import java.util.Scanner;

public class bai5 {
    private static boolean checkPerfect(int n) {
        int sum=0;
        for (int i=1;i<n;i++){
            if (n%i==0){
                sum+=i;
            }
        }
        if (sum==n) return true; else return false;
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao mot so nguyen duong n: ");
        n = sc.nextInt();
        if (checkPerfect(n)) {
            System.out.println(n + " la so hoan hao.");
        } else {
            System.out.println(n + " khong phai la so hoan hao.");
        }
        System.out.println("Cac so hoan hao trong khoang tu 1 den " + n + " la:");
        for (int i=1;i<n;i++){
            if (checkPerfect(i)){
                System.out.print(i + " ");
            }
        }
        System.out.printf("\n");
    }
}