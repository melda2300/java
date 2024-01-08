public class ÜçgenYapımı {
    public static void main(String[] args) {
        int satırlar = 16;
        for (int i = 0; i <= satırlar; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= satırlar-1-i; k++) {
                System.out.print("*"+" " );
            }
            System.out.println();
        }
    }
}
