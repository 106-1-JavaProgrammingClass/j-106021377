import java.util.Scanner;

public class HW12 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double a = scn.nextDouble();
        int b = scn.nextInt();
        System.out.println(Math.round(Math.pow(10,b)*a)/Math.pow(10,b));
    }
}
