import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner hee = new Scanner(System.in);

        int n = hee.nextInt();
        int a = 3;
        int i = 1;
        while (a*i <= n) {
            System.out.print(a*i + " ");
            i++;
        }
    }
}