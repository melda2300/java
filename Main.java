import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            // Kullanıcıdan satır ve sütun sayısını alın
            System.out.print("Çarpım tablosu için bir sayı girin: ");
            int n = input.nextInt();
            // Çarpım tablosunu oluşturun ve ekrana yazdırın
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    System.out.println(i + "x" + j + "=" + (i * j) + "\t");
                    // "\t" Bu kod, ekranda "Bu bir metin" ile "bu da bir sekme" arasında bir sekme boşluğu bırakır.
                    // Yani, "Bu bir metin" yazısından sonra gelen "\t" ifadesi nedeniyle "bu da bir sekme" metni bir
                    // sonraki sekme konumuna kayar.
                }

            }
            // Başka bir çarpım tablosu oluşturup oluşturmayacağını kullanıcıya sorun
            System.out.print("Başka bir çarpım tablosu oluşturmak ister misiniz? (evet/hayır): ");
            String cevap = input.next();

            if (!cevap.equalsIgnoreCase("evet")) {// true
                System.out.println("Program sonlandırıldı.");
                break;// Döngüyü sonlandır
            }

        }
    }
        }

