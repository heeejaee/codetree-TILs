import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner hee = new Scanner(System.in);

        int score = hee.nextInt();

        System.out.println(score == 100 ? "pass" : "failure");
    }
}