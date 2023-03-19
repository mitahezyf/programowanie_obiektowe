package URIiE2023.Lab01;



public class Kalkulator {
    public static void main(String[] args) {
        Run();
    }

    public static void Run(){
        //definicja switch

    }

    //menu
    public static void Menu() {
        //wyswietlenie tekstu dla ussera z info jakie może wykonać operacje
    }

    public static int InputInt() {
        //wczytanie int
    }

    public static String InputStrign() {
        // wczytanie string
    }

    public static void Suma() {

    }

    public static void Roznica() {

    }

    public static void Iloczyn() {

    }

    public static void Iloraz() {
        //pamietać o dzielniu przez 0

    }

    public static void Potega() {

    }

    public static void Pierwiastek() {

    }

    public static void funTryg() {

    }


    public static void Close() {
        System.out.println("\t\t\tCzy na pewno chcesz wyjsc t || T");
        String znak = InputStrign();
        String st1="t";
        String st2="T";
        if (znak.equals(st1) || znak.equals(st2) ) System.exit(0);
        //equals zwraca true jeżeli dwa podane ciągi są takie same, czyli czy znak ==st1
    }
}

