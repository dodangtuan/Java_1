package Java1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Bai8 {

//    - Giá phòng = giá cố định (theo hợp đồng) + tiền điện + tiền nước + dịch vụ...
//    - Tiền điện: 4k/1 số
//    - Tiền nước: 30k/1 khối
//    - Dich vụ khác: chủ động nhập thêm
//    Lưu ý: nhập tiền điện tháng trước/ này, số nước trước/này -> tính tự đông
    public static void main(String[] args) {
        int giaphong = 2000000;
        int giadien = 4000;
        int gianuoc = 25000;

        Scanner in = new Scanner(System.in);

        System.out.println("Nhập số điện tháng trước:");
        double sodien = in.nextDouble();

        System.out.println("Nhập số khối nước đã dùng:");
        double sonuoc = in.nextDouble();

        System.out.println("Tiền dịch vụ khác: ");
        double dv = in.nextDouble();

        double tienphong = giaphong + sodien*giadien + sonuoc*gianuoc + dv;

        System.out.printf("Tiền phòng = %.0f VNĐ ",tienphong);
        
    }
}
