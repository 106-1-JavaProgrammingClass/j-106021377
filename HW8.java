import java.util.Scanner;

public class HW8 {
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        int L = scn.nextInt();
        char ch = ',';
        System.out.println(Math.round((L*0.26418f)*10)/10f);
    }
}
