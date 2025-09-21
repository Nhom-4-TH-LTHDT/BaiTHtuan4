import java.util.Scanner;

public class Bai6 {
    // Hàm tính UCLN bằng thuật toán Euclid
    public static int tinhUCLN(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return Math.abs(a); // Đảm bảo kết quả luôn dương
    }

    // Hàm tính BCNN dựa vào UCLN
    public static int tinhBCNN(int a, int b) {
        return Math.abs(a * b) / tinhUCLN(a, b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số nguyên thứ nhất: ");
        int a = scanner.nextInt();

        System.out.print("Nhập số nguyên thứ hai: ");
        int b = scanner.nextInt();
        int ucln = tinhUCLN(a, b);
        int bcnn = tinhBCNN(a, b);

        System.out.println("UCLN của " + a + " và " + b + " là: " + ucln);
        System.out.println("BCNN của " + a + " và " + b + " là: " + bcnn);
    }
}