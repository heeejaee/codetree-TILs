import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner hee = new Scanner(System.in);

        String s = hee.nextLine();
        String t = hee.nextLine();

        String cc = s;
        s = t;
        t = cc;
        System.out.println(s+"\n"+t);
    }
}