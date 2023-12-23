public class Que24 {
    public void pattern() {
        char c = 68;
        int s = 0;
        for (int i = 1; i <= 4; i++) {
            for (int j = 65; j <= c; j++) {
                System.out.print((char) (j));
            }

            for (int sp = 1; sp <= s; sp++) {
                System.out.print(" ");
            }
            s = s + (1 * 2);
            for (int j = c; j >= 65; j--) {
                System.out.print((char) (j));
            }
            c--;
            System.out.println(" ");
        }

    }
}

class Testmain {
    public static void main(String[] args) {
        Que24 obj = new Que24();
        obj.pattern();
    }
}