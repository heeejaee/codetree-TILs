import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner hee = new Scanner(System.in);

        int n = hee.nextInt();

        int dx = 0;
        int dy = 0;

        for (int i = 0; i < n; i++) {
            String bang = hee.next();
            int d = hee.nextInt();

            if (bang.equals("E")) {
                dx += d;
            } else if (bang.equals("W")) {
                dx -= d;
            } else if (bang.equals("S")) {
                dy -= d;
            } else if (bang.equals("N")) {
                dy += d;
            }
        }

        System.out.println(dx +" " +dy);
    }
}