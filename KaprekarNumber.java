import java.util.*;
class KaprekarNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int square = num * num;
        int n = 0;
        int temp = num;
        while (temp > 0) {
            temp /= 10;
            n++;
        }
        
        int power = (int)Math.pow(10, count);
        int left = square / power;
        int right = square % power;
        int sum =  left + right;
        if (num == 1) {
            System.out.println("Kaprekar Number");
        }
        else if (sum == num) {
            System.out.println("Kaprekar Number");
            return;
        }
        else {
            System.out.println("Not Kaprekar Number");
        }
    }
}