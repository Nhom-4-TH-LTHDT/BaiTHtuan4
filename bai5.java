import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập số nguyên từ bàn phím
        System.out.print("Nhập một số nguyên: ");
        int n = sc.nextInt();

        if (laSoNguyenTo(n)) {
            System.out.println(n + " là số nguyên tố.");
        } else {
            System.out.println(n + " không phải là số nguyên tố.");
        }

        sc.close();
    }

    // Hàm kiểm tra số nguyên tố
    public static boolean laSoNguyenTo(int n) {
        if (n < 2) return false;   // nhỏ hơn 2 thì không phải số nguyên tố
        for (int i = 2; i <= Math.sqrt(n); i++) { // chỉ cần kiểm tra đến căn bậc 2
            if (n % i == 0) {
                return false; // chia hết thì không phải số nguyên tố
            }
        }
        return true; // không chia hết cho số nào thì là số nguyên tố
    }
}
