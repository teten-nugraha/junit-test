package soal6;

public class Soal6 {

    public static void main(String[] args) {
        proses(6);
    }

    private static void proses(int count) {
        for(int i=1; i <= count; i++) {
            for(int j=count; j >= 1; j--) {
                if(i >= j) {
                    System.out.print("* ");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
