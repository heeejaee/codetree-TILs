import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner hee = new Scanner(System.in);

        int a = hee.nextInt();

        if (a % 13 == 0 || a % 19 == 0) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}