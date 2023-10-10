import java.util.Scanner;
public class AverageofNumbers {
public static void main(String[]args){
    Scanner scanner = new Scanner(System.in);
    System.out.print(" 1. sayıyı giriniz:");
    int sayi1 =  scanner.nextInt();
    System.out.print(" 2. sayıyı giriniz:");
    int sayi2 = scanner.nextInt();
    System.out.print(" 3. sayıyı giriniz");
    int sayi3 = scanner.nextInt();

   double ortalama=(sayi1+sayi2+sayi3) ;
    System.out.print("girilen sayının ortalaması:"+ ortalama );

}
}
