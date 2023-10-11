import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir harf girin:");
        String karakter = "a";
        char karekter = scanner.next().charAt(0);
        System.out.println("Girilen harf: " + karekter);
        scanner.close();
        if (karakter.charAt(0) == karekter) {
            System.out.println("Girilen harf a ile aynı.");
        } else {
            System.out.println("Girilen harf 'a' ile aynı değil.");
        }
        }
    }
