import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập a: ");
        double a = sc.nextDouble();
        System.out.print("Nhập b: ");
        double b = sc.nextDouble();
        System.out.print("Nhập c: ");
        double c = sc.nextDouble();

        double min = a; // giả sử a là nhỏ nhất
        if (b < min) min = b;
        if (c < min) min = c;

        System.out.println("Số nhỏ nhất là: " + min);
        sc.close();
    }
}
