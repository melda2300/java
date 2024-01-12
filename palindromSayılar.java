public class palindromSayılar {
    static boolean isPolindrom(int number) {
        int poli = number, reverseNumber = 0, lastNumber;
        while (poli != 0) {
            System.out.println("===========");
            System.out.println("sayı =" + poli);
            lastNumber = poli % 10;
            System.out.println("Son basamak =" + lastNumber);
            reverseNumber = (reverseNumber + 10) + lastNumber;
            System.out.println("Yeni sayı =" + reverseNumber);
            poli /= 10;

        }
        return true;

    }

    public static void main(String[] args) {
        isPolindrom(101);

    }
}
