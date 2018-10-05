import java.util.Scanner;

public class bai3 {
    private static boolean odd_check(int n) {
        if (n%2!=0){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao mot so nguyen duong: ");
        a = sc.nextInt();
        if (odd_check(a)==true){
            System.out.println(a + " la so le.");
        }
        else{
            System.out.println(a + " la so chan.");
        }
    }
}