import java.util.Scanner;

public class Deneme {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("1.sayıyı giriniz : ");
        int a = scan.nextInt();
        System.out.print("2. sayıyı giriniz: ");
        int b = scan.nextInt();
        System.out.print("3.sayıyı giriniz:  ");
        int c = scan.nextInt();
        System.out.print("4. sayıyı giriniz: ");
        int d = scan.nextInt();
      if (b < a || c < a || d < a) {
    System.out.println("Bu sayılardan " + a + " dan küçük olanlar şunlardır: ");

    if (b < a) {
        System.out.println(b);
    }
    if (c < a) {
        System.out.println(c);
    }
    if (d < a) {
        System.out.println(d);
   
}else {
    System.out.println("Girilen sayılardan hiçbiri " + a + " dan küçük değil.");
}
        int min = a;
if (b < min) {
    min = b;
}
if (c < min) {
    min = c;
}
if (d < min) {
    min = d;
}
System.out.println("En küçük sayı: " + min);
        }
        double avg = (a + b + c + d) / 4.0;
System.out.println("Ortalama: " + avg);
    }
}
