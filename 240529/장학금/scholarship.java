import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner hee = new Scanner(System.in);

        int m = hee.nextInt();
        int l = hee.nextInt();

        if (m >= 90) {
            if (l >= 95) {
                System.out.println("100000");
            } else if (l >= 90) {
                System.out.println("50000");
            } else {
                System.out.println("0");
            }
        } else {
            System.out.println("0");
        }
    }
}