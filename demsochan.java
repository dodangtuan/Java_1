package day2;

public class demsochan {
     public static void main(String[] args) {
            int[] mang = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            int dem = 0;

            for (int i = 0; i < mang.length; i++) {
                if (mang[i] % 2 == 0) {
                    dem++;
                }
            }

            System.out.println("So luong so chan la: " + dem);
        }
    }

