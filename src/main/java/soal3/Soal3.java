package soal3;

public class Soal3 {

    public static void proses(int count) {
        for(int i=count; i > 0; i--) {
            for(int j = 0 ; j < i-1; j++) {
                System.out.print("*");
            }
            System.out.println("*");
        }
    }

    public static void main(String[] args) {
        proses(4);
    }
}
