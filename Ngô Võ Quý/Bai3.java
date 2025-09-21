import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số thứ nhất: ");
        double a = sc.nextDouble();
        System.out.print("Nhập số thứ hai: ");
        double b = sc.nextDouble();
        System.out.print("Chọn phép tính (+, -, *, /): ");
        char op = sc.next().charAt(0);

        switch (op) {
            case '+': System.out.println("Kết quả: " + (a + b)); break;
            case '-': System.out.println("Kết quả: " + (a - b)); break;
            case '*': System.out.println("Kết quả: " + (a * b)); break;
            case '/': 
                if (b != 0) System.out.println("Kết quả: " + (a / b));
                else System.out.println("Không thể chia cho 0");
                break;
            default: System.out.println("Phép tính không hợp lệ");
        }
    }
}
