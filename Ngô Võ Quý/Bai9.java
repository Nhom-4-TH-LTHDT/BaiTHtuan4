import java.util.*;

public class Bai9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        System.out.print("Nhập số phần tử: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử: ");
            list.add(sc.nextInt());
        }

        System.out.println("Danh sách: " + list);
    }
}
