import java.util.Scanner;
public class Singleorjavelin {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("bir sayı giriniz;");
        int sayı= scanner.nextInt();
        if (sayı % 2 == 0) {
            System.out.println("negatif sayı");
        }else{
            System.out.println("pozitif sayı");
        }
    }
}
