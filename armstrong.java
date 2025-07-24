import java.util.Scanner;

public class armstrong {

    public static boolean isArmstrong(int n) {
        int original = n;
        int result = 0;
        int digits = String.valueOf(n).length();

        while (n > 0) {
            int digit = n % 10;
            result += Math.pow(digit, digits);
            n /= 10;
        }

        return result == original;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (isArmstrong(num)) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is not an Armstrong number.");
        }

        sc.close();
    }
}
