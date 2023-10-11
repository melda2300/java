import java.util.Scanner;

public class Restorant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Adınızı girin: ");
        String isim = scanner.nextLine();
        System.out.println("Hoş geldiniz birşey alır mıydınız " + isim + " hanım");
        int cay = 1;
        int kahve = 2;
        System.out.println(" 1. menüde cay yanında da tutku var , 2. menüde kahve kofret var  hangisini   alırdınız"
                + isim + "  hanım");
        System.out.print("Seçiminizi giriniz: ");
        int secim = scanner.nextInt();
        String menu = null;
        if (secim == cay) {
            System.out.println("1. menü seçildi." + menu);
        } else if (secim == kahve) {
            System.out.println("2.menü secildi." + menu);
        } else {
            System.out.println("Geçersiz secim");
        }
        System.out.print("Siparişinizi tamamlamak için 'evet '  yazın: ");
        String tamamla = scanner.next();
        if (tamamla == "evet")
            System.out.println("Siparişiniz tamamlandı. Sağlıklı bir gün geçiriniz " + isim + " hanım");
        else {
            System.out.println("Siparişiniz iptal edildi. Sağlıklı bir gün geçiriniz " + isim + " hanım");
        }
    }
}