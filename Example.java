import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // input almak icin
        System.out.print("hoşgeldiniz menü istermisiniz:");
        String siparis = scanner.nextLine();

        String menü = "cay";
        String menü2 = "kahve";
        if (siparis.equals(menü)) {
            System.out.println("teşekür ederiz siparişiniz hazırlanıyor menu bir: "+menü);
        } else {
            System.out.println("teşekür ederiz siparişiniz hazırlanıyor menu iki: "+menü2);
        }
    }

}