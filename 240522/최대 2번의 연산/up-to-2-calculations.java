import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner hee = new Scanner(System.in);

        int a = hee.nextInt();

        if (a%2 == 0) {
            a /= 2;
        }

        if (a%2 != 0) {
            a += 1;
            a /= 2;
        }

        System.out.println(a);
        
    }
}