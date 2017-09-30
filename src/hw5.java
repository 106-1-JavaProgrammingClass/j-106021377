import java.util.Scanner;

public class hw5 {

    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        String str =  scn.nextLine();
        char ch =',';
        System.out.println(str.replace(',','\n'));
    }
}

