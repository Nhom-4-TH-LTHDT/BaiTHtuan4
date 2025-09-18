import java.util.ArrayList;
import java.util.Scanner;

public class vu_tuan4_bai10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> danhSach = new ArrayList<>();

        // Nhap danh sach ban dau
        System.out.print("Nhap so luong phan tu ban dau: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Doc bo dong trong

        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu " + (i + 1) + ": ");
            String item = scanner.nextLine();
            danhSach.add(item);
        }

        // Hien thi danh sach
        System.out.println("Danh sach hien tai: " + danhSach);

        // Them phan tu tai vi tri chi dinh
        System.out.print("Nhap phan tu can them: ");
        String phanTuThem = scanner.nextLine();
        System.out.print("Nhap vi tri can them (0 den " + danhSach.size() + "): ");
        int viTriThem = scanner.nextInt();
        scanner.nextLine(); // Doc bo dong trong

        if (viTriThem >= 0 && viTriThem <= danhSach.size()) {
            danhSach.add(viTriThem, phanTuThem);
            System.out.println("Danh sach sau khi them: " + danhSach);
        } else {
            System.out.println("Vi tri them khong hop le.");
        }

        // Xoa phan tu tai vi tri chi dinh
        System.out.print("Nhap vi tri can xoa (0 den " + (danhSach.size() - 1) + "): ");
        int viTriXoa = scanner.nextInt();

        if (viTriXoa >= 0 && viTriXoa < danhSach.size()) {
            danhSach.remove(viTriXoa);
            System.out.println("Danh sach sau khi xoa: " + danhSach);
        } else {
            System.out.println("Vi tri xoa khong hop le.");
        }

        scanner.close();
    }
}
