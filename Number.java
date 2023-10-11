import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        // Kullanıcıdan girdi almak için bir Scanner nesnesi oluşturun
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan üç farklı sayıyı girmesini isteyin
        System.out.print("1. Sayıyı giriniz: ");
        int sayi1 = scanner.nextInt();
        System.out.print("2. Sayıyı giriniz: ");
        int sayi2 = scanner.nextInt();
        System.out.print("3. Sayıyı giriniz: ");
        int sayi3 = scanner.nextInt();

        // Başlangıçta en büyük sayıyı sayi1 olarak atayın
        int enbuyuk = sayi1;
        // Diğer iki sayıyı en büyük ile karşılaştırın ve gerekirse güncelleyin
if (sayi2 > enbuyuk) { enbuyuk = sayi2; }
if(sayi3 > enbuyuk) { enbuyuk = sayi3; }
        // En büyük sayıyı ekrana yazdırın
        System.out.println("Girilen sayılardan en büyüğü  =  " +enbuyuk+  " sayı ");
        }
        }

