package soal4;

public class Soal4 {

    public static void proses(int count) {
        for (int i = count; i >= 1; i--) {
            for (int j = count; j >= 1; j--) {
                if(i >= j) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        proses(5);
    }
}
