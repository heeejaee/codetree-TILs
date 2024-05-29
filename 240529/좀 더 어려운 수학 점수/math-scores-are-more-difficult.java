import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner hee = new Scanner(System.in);

        int [] math = new int[2];
        int [] english = new int[2];

        for (int i = 0; i < 2; i++) {
            math[i] = hee.nextInt();
            english[i] = hee.nextInt();
        }

        if (math[0] > math[1]) {
            System.out.println("A");
        } else if (math[0] < math[1]) {
            System.out.println("B");
        } else {
            if (english[0] > english[1]) {
                System.out.println("A");
            } else if (english[0] < english[1]) {
                System.out.println("B");
            }
        }
    }
}