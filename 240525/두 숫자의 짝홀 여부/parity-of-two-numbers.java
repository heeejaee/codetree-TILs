import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner hee = new Scanner(System.in);

        int a = hee.nextInt();
        int b = hee.nextInt();

        if (a % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }

        if (b % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }
}