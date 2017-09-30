import java.util.Scanner;

public class hw1 {

    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        int c =scn.nextInt();
        System.out.println( Math.round(c*9/5+32*10)/10f);
    }
}

