import java.util.Scanner;

public class Bar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("adınızı giriniz");
        String isim = scanner.nextLine();
        System.out.println("merhaba" + isim + " beyfendi yaşınızı giriniz");
        int yaş = scanner.nextInt();
        if (yaş >= 18) {
            System.out.println("yaşınınız" + yaş + "oldugu için girebiliersiniz. Bizi tercih ettiğiniz için yeşekür ederiz");
        } else {
            System.out.println("yaşınız" + yaş + "olup, 18 yaşından küçük olduğunuz icin giremezsiniz");
        }
    }


}