import java.util.Scanner;

public class HW9 {
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        int g = scn.nextInt();
        char ch = ',';
        System.out.println(Math.round((g/600f)*10)/10f);
    }
}
