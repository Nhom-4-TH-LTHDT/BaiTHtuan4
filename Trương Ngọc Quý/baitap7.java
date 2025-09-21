import java.util.Scanner;

public class baitap7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử của mảng: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            System.out.print("Phần tử thứ " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }
        int tong = 0;
        for (int i = 0; i < n; i++) {
            tong += arr[i];
        }
        System.out.println("Tổng các phần tử trong mảng là: " + tong);
        scanner.close();
    }
}