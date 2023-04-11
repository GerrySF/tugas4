public class Main {
    public static void main(String[] args) {
        int jumlah = 5;
        for (int i = 1; i <= jumlah; i++) {
            for (int j = i; j <= jumlah; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}