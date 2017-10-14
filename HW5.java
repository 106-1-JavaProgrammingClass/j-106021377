import java.util.Scanner;

public class HW5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int cm = scn.nextInt();
        int kg = scn.nextInt();
        char ch = ',';
        System.out.println((double)cm/2.54f);
        System.out.println((double)kg/0.454f);
    }
}
