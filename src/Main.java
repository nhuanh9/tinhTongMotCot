import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] array;
        int n;
        System.out.println("Nhap kich co ma tran:");
        n = sc.nextInt();
        array = new double[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("nhap phan tu o hang " + i + " cot " + j);
                array[i][j] = sc.nextDouble();
            }
        }
        int column;
        System.out.println("Nhap cot ban muon tinh tong:");
        column = sc.nextInt();
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += array[i][column];
        }
        System.out.println("Tong cua cot " + column + " la:" + sum);
    }
}
