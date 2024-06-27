import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner hee = new Scanner(System.in);

        int a = hee.nextInt();
        int b = hee.nextInt();

        while (a <= b) {
            System.out.print(a + " ");
            a += 2;
        }
    }
}