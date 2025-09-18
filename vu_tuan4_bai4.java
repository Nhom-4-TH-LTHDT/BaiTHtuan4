import java.util.Scanner;

public class vu_tuan4_bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap n: ");
        int n = scanner.nextInt();

        int tong = 0;
        for (int i = 1; i <= n; i++) {
            tong += i;
        }

        System.out.println("Tong cac so tu 1 den " + n + " la: " + tong);

        scanner.close();
    }
}
