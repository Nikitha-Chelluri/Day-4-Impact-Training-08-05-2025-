import java.util.*;
class NumberPatern {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 1;
        for (int r = 1; r <= n; r++) {
            for (int c = 1; c <= n; c++) {
                System.out.print(i+"\t");
                i++;
            }
            System.out.println();
        }
    }
}