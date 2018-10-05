import java.util.Scanner;

public class bai1{
    public static void main(String[] args){
        int[] value = new int [4];
        String[] varName = {"a1","a2","b1","b2"};
        int minFirst = Integer.MAX_VALUE, minSecond = minFirst;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 4; i++){
            System.out.print("Nhap " + varName[i] + ": ");
            value[i] = sc.nextInt();
            if (value[i] < minFirst){
                minSecond = minFirst;
                minFirst = value[i];
            }
            else if (value[i]<minSecond && value[i]!=minFirst)
                minSecond=value[i];
        }
        sc.close();
        if (minSecond == Integer.MAX_VALUE)
            System.out.println("Khong co so nho thu hai trong 4 so tren.");
        else
            System.out.println("So nho thu hai trong 4 so la " + minSecond);
    }
}