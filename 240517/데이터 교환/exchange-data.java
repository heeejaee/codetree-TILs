public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        for (int i = 0; i < 3; i++) {
            int a = 5; 
            int b = 6;
            int c = 7;

            switch (i) {
                case 0:
                a = c;
                System.out.println(a);
                break;
                case 1:
                b = a;
                System.out.println(b);
                break;
                default:
                c = b;
                System.out.println(c);
            }
        }
    }
}