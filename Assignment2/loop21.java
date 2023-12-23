//WAP to print the reverse of all number from 101 to 199

class Test{

public static void main(String[] args) {
        for (int i = 101; i <= 199; i++) {
            int num = i;
            int reversed = 0;
            while (num != 0) {
                int digit = num % 10;
                reversed = reversed * 10 + digit;
                num = num/10;
            }
            System.out.println(reversed);
        }
    }
}