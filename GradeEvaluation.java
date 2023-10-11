import java.util.Scanner;
public class GradeEvaluation {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("öğrencinin notunu gitiniz: ");
      int not= scanner.nextInt();
        if (50 >= not) {
            System.out.println("kaldı");
        } else {
            System.out.println("gecti");
        }
    }

}
