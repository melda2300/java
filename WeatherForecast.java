import java.util.Scanner;
public class WeatherForecast {
public static void main(String[]args){
    Scanner scanner = new Scanner(System.in);
    System.out.print("hava durumuyla ilgili bir kelime girermisiniz:");
    String kelime= scanner.next();
    if (kelime.equalsIgnoreCase ("güneşli") ){
        // "equalsIgnoreCase " String metodu olarak kullanılır ve
        // iki metin dizgisini (String) karşılaştırmak için kullanılır.
        System.out.print("Hava güneşli");
    } else if (kelime.equalsIgnoreCase("yağmurlu")){
        System.out.print("hava yağmurlu");
    }else {
        System.out.print("Hava durumu bilinmiyor");
    }
}
}
