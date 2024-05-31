import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner hee = new Scanner(System.in);

        int n = hee.nextInt();
        int a = n;

        for (int i = 0; i < 5; i++) {
            System.out.print(a + " ");
            a += n;
        }
    }
}