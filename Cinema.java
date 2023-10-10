import java.util.Scanner;
public class Cinema {
public static void main(String[]argms) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("yaşınızı giriniz:");
    int yaş = scanner.nextInt();
    if (yaş >= 18) {
        System.out.println("Yaşınız uygundur. İyi seyirler!");
    } else {
        System.out.println("Yaşınız bu filme uygun değildir.");
    }
}
}
