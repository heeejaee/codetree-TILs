import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner hee = new Scanner(System.in);

        int a = hee.nextInt();

        for (int i = 0; i < 4; i++) {
            int be = hee.nextInt();
            if (a > be) System.out.println("1");
            else System.out.println("0");
        }
    }
}