import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner hee = new Scanner(System.in);

        int fAge = hee.nextInt();
        String fGen = hee.nextLine();
        int sAge = hee.nextInt();
        String sGen = hee.nextLine();
        if ((fAge >= 19 && fGen.equals(" M")) || (sAge >= 19 && sGen.equals(" M"))) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}