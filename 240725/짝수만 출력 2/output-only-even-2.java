import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner hee = new Scanner(System.in);

        int b = hee.nextInt();
        int a = hee.nextInt();

        while (b >= a) {
            if (b % 2 == 0) {
                System.out.print(b + " ");
            }
            b--; 
        }
    }
}