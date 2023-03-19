import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        calc();
    }

    public static void calc() {
        Scanner a = new Scanner(System.in);

        System.out.println("podaj co chcesz policzyc:");
        System.out.println("1 sumowanie");
        System.out.println("2 odejmowanie");
        System.out.println("3 mnozenie");
        System.out.println("4 dzielenie");
        System.out.println("5 potęga");
        System.out.println("6 pierwiastkowanie");
        System.out.println("7 funkcje trygonometryczne");

        int choice = a.nextInt();

        switch (choice){
            case 1:
                suma();
            case 2:
                roznica();
            case 3:
                mnozenie();
            case 4:
                dzielenie();
            case 5:
                potega();
            case 6:
                pierw();
            case 7:
                tryg();
        }

    }
    public static void suma(){
        Scanner suma1 = new Scanner(System.in);
        System.out.println("podaj pierwszą liczbe: ");
        double sum1 = suma1.nextDouble();

        Scanner suma2 = new Scanner(System.in);
        System.out.println("podaj drugą liczbe: ");
        double sum2 = suma2.nextDouble();

        System.out.println("wynik sumy to: "+(sum1+sum2));

    }
    public static void roznica(){
        Scanner rozn1 = new Scanner(System.in);
        System.out.println("podaj pierwszą liczbe: ");
        double roz1 = rozn1.nextDouble();

        Scanner rozn2 = new Scanner(System.in);
        System.out.println("podaj drugą liczbe: ");
        double roz2 = rozn2.nextDouble();

        System.out.println("wynik roznicy to: "+(roz1-roz2));
    }
    public static void mnozenie(){
        Scanner input1 = new Scanner(System.in);
        System.out.println("podaj pierwszą liczbe: ");
        double inp1 = input1.nextDouble();

        Scanner input2 = new Scanner(System.in);
        System.out.println("podaj drugą liczbe: ");
        double inp2 = input2.nextDouble();

        System.out.println("wynik mnozenia to: "+(inp1*inp2));
    }
    public static void dzielenie(){
        Scanner input1 = new Scanner(System.in);
        System.out.println("podaj pierwszą liczbe: ");
        double inp1 = input1.nextDouble();

        Scanner input2 = new Scanner(System.in);
        System.out.println("podaj drugą liczbe: ");
        double inp2 = input2.nextDouble();

        System.out.println("wynik dzielenia to: "+(inp1/inp2));
    }
    public static void potega(){
        Scanner input1 = new Scanner(System.in);
        System.out.println("podaj podstawe potęgi: ");
        double inp1 = input1.nextDouble();

        Scanner input2 = new Scanner(System.in);
        System.out.println("podaj wykładnik potęgi: ");
        double inp2 = input2.nextDouble();

        System.out.println("wynik pierwiastkowania to: "+(Math.pow(inp1, inp2)));
    }
    public static void pierw(){
        Scanner input1 = new Scanner(System.in);
        System.out.println("podaj liczbe pierwiastkowana: ");
        double inp1 = input1.nextDouble();

        Scanner input2 = new Scanner(System.in);
        System.out.println("podaj stopien pierwiastka: ");
        double inp2 = input2.nextDouble();

        System.out.println("wynik to: "+(Math.pow(inp1, 1/inp2)));
    }
    public static void tryg(){
        Scanner input1 = new Scanner(System.in);
        System.out.println("podaj wartosc kąta w stopniach: ");
        double inp1 = input1.nextDouble();
        double inp2 = ((Math.PI/180)*inp1);

        System.out.println("sinus:"+Math.sin(inp2));
        System.out.println("cosinus:"+Math.cos(inp2));
        System.out.println("tangens:"+Math.tan(inp2));

    }
}