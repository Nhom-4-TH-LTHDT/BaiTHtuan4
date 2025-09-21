import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class bai8 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        // Nhập số phần tử mảng
        System.out.print("Nhập số phần tử của mảng: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Nhập mảng
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Tìm phần tử xuất hiện nhiều nhất
        int ketQua = timPhanTuXuatHienNhieuNhat(arr);

        System.out.println("Phần tử xuất hiện nhiều nhất trong mảng là: " + ketQua);

        sc.close();
    }

    // Hàm tìm phần tử xuất hiện nhiều nhất
    public static int timPhanTuXuatHienNhieuNhat(int[] arr) {
        Map<Integer, Integer> tanSo = new HashMap<>();

        // Đếm tần số xuất hiện
        for (int num : arr) {
            tanSo.put(num, tanSo.getOrDefault(num, 0) + 1);
        }

        int phanTu = arr[0];
        int max = 0;

        // Tìm phần tử có tần số lớn nhất
        for (Map.Entry<Integer, Integer> entry : tanSo.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                phanTu = entry.getKey();
            }
        }

        return phanTu;
    }
}
