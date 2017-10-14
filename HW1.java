import java.util.Scanner;

public class HW1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int mile = scn.nextInt();
        char ch = ',';
        System.out.println((double)Math.round(mile*1.6f*10)/10f);
    }
}
