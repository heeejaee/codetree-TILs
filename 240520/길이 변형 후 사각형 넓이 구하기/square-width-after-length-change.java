import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner hee = new Scanner(System.in);

        int garo = hee.nextInt();
        int sero = hee.nextInt();

        garo += 8;
        sero *= 3;

        System.out.printf("%d\n%d\n%d",garo,sero,garo*sero);
    }
}