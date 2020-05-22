package klasapodstawy.zadanie1;

public class Main {

    public static void main(String[] args) {

        String LINE = "----------------------------------------";
        Kolo kolo1 = null;
        try {
            kolo1 = new Kolo(20);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }

        System.out.println(LINE);
        kolo1.drukuj();
        System.out.printf("dlugosc obwodu   kola: %,10.2f\n", kolo1.obwod());
        System.out.printf("pole powierzchni kola: %,10.2f\n", kolo1.pole());

        System.out.println(LINE);
        kolo1.ustawPromien(30);
        kolo1.drukuj();
        System.out.printf("dlugosc obwodu   kola: %,10.2f\n", kolo1.obwod());
        System.out.printf("pole powierzchni kola: %,10.2f\n", kolo1.pole());

        System.out.println(LINE);
        Trapez trapez1 = new Trapez( 10, 5, 10, 5 );
        trapez1.drukuj();
        System.out.printf("dlugosc obwodu   trapezu: %,10.2f\n", trapez1.obwod());
        System.out.printf("wysokość  trapezu:        %,10.2f\n", trapez1.wysokosc());
        System.out.printf("pole powierzchni trapezu: %,10.2f\n", trapez1.pole());

        System.out.println(LINE);
        trapez1.ustawWymiary(20,7.071,10,7.071);
        trapez1.drukuj();
        System.out.printf("wysokość  trapezu:        %,10.2f\n", trapez1.wysokosc());
        System.out.printf("dlugosc obwodu   trapezu: %,10.2f\n", trapez1.obwod());
        System.out.printf("pole powierzchni trapezu: %,10.2f\n", trapez1.pole());

        System.out.println(LINE);
        trapez1.ustawWymiary(10,7.071,0,7.071);
        trapez1.drukuj();
        System.out.printf("wysokość  trapezu:        %,10.2f\n", trapez1.wysokosc());
        System.out.printf("dlugosc obwodu   trapezu: %,10.2f\n", trapez1.obwod());
        System.out.printf("pole powierzchni trapezu: %,10.2f\n", trapez1.pole());

        System.out.println(LINE);
        trapez1.ustawWymiary(5,0,0,5);
        trapez1.drukuj();
        System.out.printf("wysokość  trapezu:        %,10.2f\n", trapez1.wysokosc());
        System.out.printf("dlugosc obwodu   trapezu: %,10.2f\n", trapez1.obwod());
        System.out.printf("pole powierzchni trapezu: %,10.2f\n", trapez1.pole());
    }
}

