import java.util.Scanner;
public class charactertype {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir karakter girin: ");
        char karakter = scanner.next().charAt(0);// Kullanıcının girdiği ilk karakteri al
        if (Character.isLetter(karakter)) {
            System.out.println( + karakter + "bir harf");
            //Character.isLetter(karakter): Bu ifade, Character sınıfının isLetter(char ch) metodu kullanılarak bir
            // karakterin bir harf olup olmadığını kontrol eder.
            // Eğer karakter bir harf ise, bu ifade true değeri döndürür; aksi takdirde false değerini döndürür.
        }else if (Character.isDigit(karakter)) {
            // (Character.isDigit(karakter)): Bu kısım, karakter'in bir harf değilse
            // (yani bir rakam olup olmadığını kontrol eder).
            // Eğer karakter bir rakam ise, bu şart bloğu çalışır.
            System.out.println(+ karakter+ "bir rakam");
        }else {
            System.out.println(+ karakter+ " bir özel karakter");
        }
        scanner.close();
    }
}
