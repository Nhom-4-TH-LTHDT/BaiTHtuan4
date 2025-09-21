import java.util.Scanner;
public class Baitap1
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập một số: ");
        double so = scanner.nextDouble();
        if (so > 0) {
            System.out.println("Đây là số dương.");
        } else if (so < 0) {
            System.out.println("Đây là số âm.");
        } else {
            System.out.println("Đây là số 0.");
        }
        scanner.close();
    }
}