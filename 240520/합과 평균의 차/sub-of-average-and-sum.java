import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner hee = new Scanner(System.in);

        int sum = 0;

        for (int i = 0; i < 3; i++) sum += hee.nextInt();

        System.out.println(sum);
        System.out.println(sum/3);
        System.out.println(sum-sum/3);
    }
}