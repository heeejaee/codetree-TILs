import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner hee = new Scanner(System.in);

        int a = hee.nextInt();

        if (a % 2 != 0) {
            a += 3;
        }

        if (a % 3 == 0) {
            a /= 3;
        }

        System.out.println(a);
    }
}