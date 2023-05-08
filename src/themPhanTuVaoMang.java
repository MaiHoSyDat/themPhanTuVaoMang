import java.util.Arrays;
import java.util.Scanner;

public class themPhanTuVaoMang {
    public static void main(String[] args) {
        int[] arr = {1, 5, 2, 7, 6, 3};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập phần tử cần thêm vào mảng:");
        int x = scanner.nextInt();
        System.out.println("Nhập vị trí cần thêm phần tử " + x);
        int index = scanner.nextInt();
        int[] arr1 = new int[arr.length + 1];
        if (index < 0 || index >= arr.length) {
            System.out.println("Không thể chèn phần tử vào mảng");
        } else {
            for (int i = 0; i < arr1.length; i++) {
                if (i < index) {
                    arr1[i] = arr[i];
                } else if (i == index) {
                    arr1[i] = x;
                } else {
                    arr1[i] = arr[i-1];
                }
            }
        }
        System.out.println(Arrays.toString(arr1));
    }
}
