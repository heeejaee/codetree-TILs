import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner hee = new Scanner(System.in);

        int am = hee.nextInt();
        int ae = hee.nextInt();

        int bm = hee.nextInt();
        int be = hee.nextInt();

        if (am > bm && ae > be) System.out.println("1");
        else System.out.println("0");
    }
}