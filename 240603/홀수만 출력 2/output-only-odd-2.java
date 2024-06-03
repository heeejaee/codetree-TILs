import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner hee = new Scanner(System.in);

        int b = hee.nextInt();
        int a = hee.nextInt();

        for (int i = b; i >= a; i --) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}