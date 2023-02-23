package Java1;

import java.util.Scanner;

public class Bai7 {
//    Viết chương trình tính chu vi và diện tích hình chữ nhật.

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Nhập vào cạnh 1");
        double a = in.nextDouble();

        System.out.println("Nhập vào cạnh 2");
        double b = in.nextDouble();

        if(a>0 && b>0) {
            double cv = (a + b) * 2;
            double dt = a * b;
            System.out.printf("Chu vi hcn %.3f: \tDiện tích hcn %.3f:",cv,dt);
        }
        else {
            System.out.println("không phải là hình chữ nhật");
        }
    }
}
