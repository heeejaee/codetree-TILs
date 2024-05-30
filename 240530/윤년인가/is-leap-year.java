import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner hee = new Scanner(System.in);

        int y = hee.nextInt();

        if (y % 100 == 0 && y % 400 != 0) {
            System.out.println("false");
        } else {
            if (y % 4 == 0) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }
    }
}