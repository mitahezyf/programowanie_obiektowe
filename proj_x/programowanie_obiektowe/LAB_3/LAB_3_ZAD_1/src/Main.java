import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        average();
    }

    public static void average() {
        Scanner input = new Scanner(System.in);
        System.out.println("podaj liczbe studentow ");
        int count = input.nextInt();
        int[] tab = new int[count];

        for (int i = count; i >= 0; i--) {

            Scanner inp = new Scanner(System.in);
            System.out.println("podaj punkty dla studenta "+i);
            int points = inp.nextInt();





        }

    }
}