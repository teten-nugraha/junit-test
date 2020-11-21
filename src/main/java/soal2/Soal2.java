package soal2;

public class Soal2 {

    public static void proses(int count) {
        for (int i = 0; i <= count; i++) {
            for(int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        proses(7);
    }

}
