import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner hee = new Scanner(System.in);

        int a = hee.nextInt();
        int b = hee.nextInt();

        double c = a+b;
        double d = a-b;

        System.out.printf("%.2f",c/d);
    }
}