import java.util.Scanner;

public class hw7 {

    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        int L =scn.nextInt();
        System.out.println((double) Math.round(L*0.26418*10)/10f);
    }
}
