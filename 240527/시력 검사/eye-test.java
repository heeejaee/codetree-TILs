import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner hee = new Scanner(System.in);

        double a = hee.nextDouble();
        double b = hee.nextDouble();

        if (a >= 1.0 && b >= 1.0) {
            System.out.println("High");
        } else if (a >= 0.5 && b >= 0.5) {
            System.out.println("Middle");
        } else {
            System.out.println("Low");
        }
    }
}