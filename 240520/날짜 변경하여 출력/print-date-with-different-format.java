import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner hee = new Scanner(System.in);

        hee.useDelimiter("\\.");
        int y = hee.nextInt();
        int m = hee.nextInt();
        int d = hee.nextInt();

        System.out.printf("%d-%d-%d",m,d,y);
    }
}