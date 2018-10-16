
import java.util.Scanner;

public class bai9 {
    private static String NormalizeString(String inputString) {
        inputString = inputString.trim();
        inputString = inputString.replace(".", ". ");
        inputString = inputString.replace(" .", ".");
        inputString = inputString.replaceAll("\\s+", " ");
        inputString = inputString.toLowerCase();
        String outputString = "";
        outputString += Character.toUpperCase(inputString.charAt(0));
        for (int i = 1; i < inputString.length(); i++) {
            if (i > 2 && inputString.charAt(i - 2) == '.') {
                outputString += Character.toUpperCase(inputString.charAt(i));
            } else {
                outputString += inputString.charAt(i);
            }
        }
        return outputString;
    }
    public static void main(String[] args) {
        System.out.print("Nhap chuoi: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        System.out.println("Chuoi sau khi chuan hoa la: " + NormalizeString(str));
    }
}