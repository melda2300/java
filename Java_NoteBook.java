import java.util.Scanner;
public class Java_NoteBook {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            Scanner scanner=new Scanner(System.in);
            System.out.println("Notunuzu giriniz:");
            String not = scanner.nextLine();
            // Bu, kullanıcıdan bir satırlık metin girişi okumak için kullanılır.
            System.out.println(not);
            System.out.println("Not kaydetsin mi (evet/hayır):");
            String kaydet = scanner.nextLine();

            if (kaydet.equalsIgnoreCase("evet")) {
                System.out.println("Not kaydedildi.");
            } else if (kaydet.equalsIgnoreCase("hayır")) {
                System.out.println("Not kaydedilmedi.");
            } else {
                System.out.println("Geçersiz giriş. Lütfen 'evet' veya 'hayır' girin.");
            }
            System.out.println("Yeni not eklemek ister misiniz (evet/hayır):");
            String devam = scanner.nextLine();
            if (devam.equalsIgnoreCase("evet")) {
                System.out.println("yeni not");
            }  else if (devam.equalsIgnoreCase("hayır")) {
                System.out.println("hayır");
            } else {
                System.out.println("gecersiz ");
                break; }
        }
    }
        }
