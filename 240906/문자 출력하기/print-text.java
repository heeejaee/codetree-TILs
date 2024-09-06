import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner hee = new Scanner(System.in);

        String str = hee.nextLine();

        for (int i = 0; i < 8; i++) {
            System.out.print(str);
        }
    }
}