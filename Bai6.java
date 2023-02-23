package Java1;

import java.util.Scanner;

public class Bai6 {
//    Nhập vào 3 số a, b, c từ bàn phím, Hỏi a, b, c có phải 3 cạnh của tam giác hay ko?
//    Nếu có hãy tính chu vi và diện tích.

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Nhập vào cạnh của tam giác a,b,c:");
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();

        if(a <= b + c || b <= a + c || c <= a + b){
            System.out.println("là một tam giác");
            double cv = a+b+c;
            double p = cv/2;
            double dt = Math.sqrt(p*(p - a)*(p - b)*(p - c));

            System.out.printf("chu vi tam giac %.3f \tDiện tích tam giác %.3f",cv,dt );
        }
        else{
            System.out.println("không là tam giác");
        }

    }
}
