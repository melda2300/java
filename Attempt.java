import java.util.Scanner;
public class Attempt {
    public static void main(String[]args){
    Scanner scanner = new Scanner(System.in);
        System.out.print("bir sayı giriniz: ");
        int sayı = scanner.nextInt();
        if (sayı > 0){
            System.out.println("pozitif sayı");
        }else if (sayı<0){
            System.out.println("negatif sayı");
        }else {
            System.out.println("sıfır sayı");
        }
    }
}
