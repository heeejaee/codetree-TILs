import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner hee = new Scanner(System.in);

        String s = hee.nextLine();
        char c = s.charAt(0);
        double a = hee.nextDouble();
        double b = hee.nextDouble();

        System.out.println(c);
        System.out.printf("%.2f\n%.2f",a,b);
    }
}