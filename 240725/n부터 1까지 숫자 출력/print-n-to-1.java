import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner hee = new Scanner(System.in);

        int n = hee.nextInt();

        while (n > 0) {
            System.out.print(n + " ");
            n--;
        }
    }
}