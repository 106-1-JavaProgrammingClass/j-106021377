import java.util.Scanner;

public class hw3 {

    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        int chinese =scn.nextInt();
        int english =scn.nextInt();
        int math =scn.nextInt();
        char ch =',';
        System.out.println(chinese+english+math);
        System.out.println((chinese+english+math)/3);

    }
}
