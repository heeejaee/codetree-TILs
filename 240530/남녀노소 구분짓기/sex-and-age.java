import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner hee = new Scanner(System.in);
        //남자는 0 여자는 1;

        int gen = hee.nextInt();

        int age = hee.nextInt();

        if (gen == 0) {
            if (age >= 19) {
                System.out.println("MAN");
            } else {
                System.out.println("BOY");
            }
        } else {
            if (age >= 19) {
                System.out.println("WOMAN");
            } else {
                System.out.println("GIRL");
            }
        }
    }
}