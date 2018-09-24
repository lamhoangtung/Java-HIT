import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        String ten1, ten2, line= "---------------------";
        int tuoi1,tuoi2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao ten cua nguoi so 1: ");
        ten1 = sc.nextLine();
        System.out.print("Nhap vao tuoi cua nguoi so 1: ");
        tuoi1 = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhap vao ten cua nguoi so 2: ");
        ten2 = sc.nextLine();
        System.out.print("Nhap vao tuoi cua nguoi so 2: ");
        tuoi2 = sc.nextInt();       
        System.out.printf("%s \n%-15s%-10s \n%s \n", line, "Ten", "Tuoi", line);
        System.out.printf("%-15s%-10d \n%-15s%-10d\n", ten1, tuoi1, ten2, tuoi2);
    }
}