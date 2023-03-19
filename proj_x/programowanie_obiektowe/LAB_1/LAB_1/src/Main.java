import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        name();
//        basiccalc();
//        isEven();
//        modtf();
//        power();
//        square();
        triangle();
    }
    public static void name(){
        String imie = "Krzysztof";
        int wiek = 20;
        System.out.println("Imie: "+imie);
        System.out.println("wiek: "+wiek);
    }

    public static void basiccalc() {
        Scanner scana = new Scanner(System.in);
        System.out.println("podaj wartosc a");
        int a = scana.nextInt();

        Scanner scanb = new Scanner(System.in);
        System.out.println("podaj wartosc b");
        int b = scanb.nextInt();

        System.out.println("wynik dodawania: "+(a+b));
        System.out.println("wynik odejmowania: "+(a-b));
        System.out.println("wynik mnożenia: "+a*b);
        System.out.println("wynik dzielenia: "+a/b);
    }
    public static boolean isEven(){
        Scanner scana = new Scanner(System.in);
        System.out.println("podaj wartosc do sprawdzenia");
        int a = scana.nextInt();

        if (a%2 == 0) {
            System.out.println("true");
            return true;
        }else{
            System.out.println("false");
            return false;
        }
    }
    public static boolean modtf(){
        Scanner scana = new Scanner(System.in);
        System.out.println("podaj wartosc do sprawdzenia");
        int a = scana.nextInt();

        if (a%3 == 0) {
            System.out.println("true");
            return true;
        }else{
            System.out.println("false");
            return false;
        }
    }
    public static void power(){
        Scanner scana = new Scanner(System.in);
        System.out.println("podaj wartość do potęgowania:");
        int a = scana.nextInt();

        System.out.println("3 potęta liczby "+a+" to: "+(Math.pow(a, 3)));
    }
    public static void square(){
        Scanner scana = new Scanner(System.in);
        System.out.println("podaj wartość do pierwiastkowania:");
        int a = scana.nextInt();

        System.out.println("pierwaistek kwadratowy liczby "+a+" to: "+(Math.sqrt(a)));
    }
    public static boolean triangle(){
        Scanner scana = new Scanner(System.in);
        System.out.println("podaj poczatek zakresu:");
        int a = scana.nextInt();

        Scanner scanb = new Scanner(System.in);
        System.out.println("podaj koniec zakresu:");
        int b = scanb.nextInt();

        Random side1 = new Random(a - b);
        Random side2 = new Random(a- b);
        System.out.println("pirewszy random"+side1+"drugi random"+side2);
        return true;


    }
}