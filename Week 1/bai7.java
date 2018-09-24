import java.util.Scanner;

public class bai7 {
    public static void main(String[] args) {
        float n;
        System.out.print("Nhap duong kinh cua hinh tron: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextFloat();
        System.out.printf("Chu vi hinh tron la: %f\n", Math.PI * Math.pow(n/2.0, 2));
        System.out.printf("The tich hinh cau: %f\n", Math.PI * Math.pow(n/2.0, 3) * (3 / 4.0));
    }
}