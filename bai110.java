package day2;

public class bai110 {

        public static void main(String[] args) {
            int tongTien = 200000;
            int to1000, to2000, to5000, tongTienGiayBac;

            for (to1000 = 0; to1000 <= tongTien / 1000; to1000++) {
                for (to2000 = 0; to2000 <= tongTien / 2000; to2000++) {
                    for (to5000 = 0; to5000 <= tongTien / 5000; to5000++) {
                        tongTienGiayBac = to1000 * 1000 + to2000 * 2000 + to5000 * 5000;
                        if (tongTienGiayBac == tongTien) {
                            System.out.println("Phuong an: " + to1000 + " to giay bac 1000d, "
                                    + to2000 + " to giay bac 2000d, " + to5000 + " to giay bac 5000d");
                        }
                    }
                }
            }
        }
}
