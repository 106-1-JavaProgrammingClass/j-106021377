import java.util.Scanner;

public class HW2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int c = scn.nextInt();
        char ch = ',';
        System.out.println(Math.round((c*9/5f+32)*10)/10f);
    }
}
