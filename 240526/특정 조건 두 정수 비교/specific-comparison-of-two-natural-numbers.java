import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner hee = new Scanner(System.in);

        int a = hee.nextInt();
        int b = hee.nextInt();

        if (a < b) System.out.print("1");
        else System.out.print("0");

        System.out.print(" ");

        if (a == b) System.out.print("1");
        else System.out.print("0");
    }
}