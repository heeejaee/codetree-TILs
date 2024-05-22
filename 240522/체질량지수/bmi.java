import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner hee = new Scanner(System.in);

        int h = hee.nextInt();
        int w = hee.nextInt();

        double b = (10000*w)/(h*h);

        System.out.println((int)b);

        if (b >= 25) System.out.println("Obesity");
    }
}