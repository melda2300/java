import java.util.Scanner;
public class ProductStockControl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir ürünün stok durumunu giriniz (var/yok): ");
        String ürün = scanner.next();
        if (ürün .equalsIgnoreCase("var")   ) {
            System.out.println(" ürün elimizde var");
        } else if (ürün.equalsIgnoreCase("yok")) {
            System.out.println("Ürün elimizde yok.");
        } else {
            System.out.println("Geçersiz giriş. Lütfen 'var' veya 'yok' girin.");
        }
        }
    }
