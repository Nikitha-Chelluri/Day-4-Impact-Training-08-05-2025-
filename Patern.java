import java.util.*;
class Patern {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                System.out.print("* \t");
            }
            System.out.println();
        }
    }
}