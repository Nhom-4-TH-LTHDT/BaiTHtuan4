import java.util.Scanner;

public class vu_tuan4_bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap n: ");
        int n = scanner.nextInt();

        if (n > 0) {
            System.out.println(n +" la so duong.");
        } else if (n < 0) {
            System.out.println(n + " la so am.");
        } else {
            System.out.println(n + " la 0.");
        }

        scanner.close();
    }
}
