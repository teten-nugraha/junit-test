package id.src.soal1;

/**
 * carilah nilai genap pada array dibawah ini dan carilah nilai yang tertingga
 *
 * input => [-2,0,4,3,10,99,45,34,3,9,]
 *
 * expected =>
 * jumlah ganjil => 5
 * terbesar => 99
 *
 */
public class soal1 {

    public static void main(String[] args) {
        int[]jumlah = {-2,0,4,3,10,99,45,34,3,9};

        proses(jumlah);
    }

    private static void proses(int[] jumlah) {
        int count = jumlah.length;
        int countGanjil = 0;
        int maxGanjil = 0 ;
        if(count > 0) {
            for(int i=0; i<count; i++) {
                if(jumlah[i] % 3 == 0 && jumlah[i] != 0) {
                    countGanjil += 1;
                    if(maxGanjil < jumlah[i]) {
                        maxGanjil = jumlah[i];
                    }
                }
            }
        }

        System.out.println("Jumlah Ganjil " + countGanjil);
        System.out.println("Max Ganjil " + maxGanjil);
    }
}
