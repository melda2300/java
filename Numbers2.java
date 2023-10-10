import java.util.Scanner;
public class Numbers2 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("bi sayı yazınız: ");
        int sayı = scanner.nextInt();
if (sayı > 0){
    System.out.println("girilen sayı pozitiftir.");
} else if ( 0 < sayı){
    System.out.println("girilen sayı negatiftir.");
}else {
    System.out.println("girilen sayı sıfırdır");
}
    }
}
