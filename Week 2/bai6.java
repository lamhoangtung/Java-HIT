import java.util.Scanner;

public class bai6 {
    private static boolean checkPerfect(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        if (sum == n)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao so n: ");
        n = sc.nextInt();
        sc.close();
        if (n<=6){
            System.out.println("Khong co so hoan hao nao nho hon " + n + ".");
        }
        else{
            System.out.println("Cac so hoan hao nho hon " + n + " la:");
            for (int i = 1; i < n; i++) {
                if (checkPerfect(i))
                    System.out.print(i + " ");
            }
            System.out.printf("\n");
        }
    }
}