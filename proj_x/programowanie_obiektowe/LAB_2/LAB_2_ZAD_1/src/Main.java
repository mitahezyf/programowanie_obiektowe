import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       delta();
    }
    public static void delta(){

                            // pobieranie abc
        System.out.println("podaj czynniki a b c rownania ax^2 + bx + c");
        Scanner ascan = new Scanner(System.in);
        System.out.println("podaj a");
        int a = ascan.nextInt();

        Scanner bscan = new Scanner(System.in);
        System.out.println("podaj b");
        int b = bscan.nextInt();

        Scanner cscan = new Scanner(System.in);
        System.out.println("podaj c");
        int c = cscan.nextInt();
                                // liczenie delty b^2 -4ac
        int del = (int) (Math.pow(b, 2)-(4*a*c));
        System.out.println("delta: "+del);
        double delsqr = Math.sqrt(del);

        while (del < 0){
            System.out.println("delta niemożliwa");
            System.exit(0);
        }
        while (del == 0){
            double x = ((-b) / (2 * a));
            System.out.println("x: "+x);
                System.exit(0);
        }
        while (del >= 0){

            double x1 = ((-b - delsqr) / (2 * a));
            double x2 = ((-b + delsqr) / (2 * a));
            // printowanie x1 x2
            System.out.println("x1: " + x1);
            System.out.println("x2: " + x2);
                System.exit(0);
        }
    }
}