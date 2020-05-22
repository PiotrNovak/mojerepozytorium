package klasapodstawy.zadanie1;

public class Trapez {

    private double bokA=0, bokB=0, bokC=0, bokD=0;

    Trapez(double bokA, double bokB, double bokC, double bokD) {

        Boolean wymiarPoprawny = (bokA>=0 && bokB>=0 && bokC>=0 && bokD>=0) &&
                                 ((bokA-bokC)*(bokA-bokC)>=Math.abs(bokB*bokB-bokD*bokD));
        if (wymiarPoprawny) {
            this.bokA = bokA;
            this.bokB = bokB;
            this.bokC = bokC;
            this.bokD = bokD;
        } else {
            this.bokA = 0;
            this.bokC = 0;
            this.bokB = 0;
            this.bokD = 0;
        }
    }

    public double wysokosc() {
        double i = -bokA + bokB + bokC + bokD;
        double j =  bokA + bokB - bokC + bokD;
        double k =  bokA + bokB - bokC - bokD;
        double l =  bokA - bokB - bokC + bokD;
        if (bokC!=bokA) {
            return Math.sqrt(i*j*k*l)/(2*Math.abs(bokC - bokA));
        } else {
            return bokB;
        }
    }

    public double pole() {
        return wysokosc()*(bokA+bokC)/2;
    }

    public double obwod() {
        return bokA + bokB + bokC + bokD;
    }

    public void ustawWymiary(double bokA, double bokB, double bokC, double bokD){

        Boolean wymiarPoprawny = (bokA>=0 && bokB>=0 && bokC>=0 && bokD>=0) &&
                                 ((bokA-bokC)*(bokA-bokC)>=Math.abs(bokB*bokB-bokD*bokD));
        if (wymiarPoprawny) {
            this.bokA = bokA;
            this.bokB = bokB;
            this.bokC = bokC;
            this.bokD = bokD;
        } else {
            this.bokA = 0;
            this.bokC = 0;
            this.bokB = 0;
            this.bokD = 0;
        }
    }

    public double pobierzBokA() {
        return bokA;
    }

    public double pobierzBokB() {
        return bokB;
    }
    public double pobierzBokC() {
        return bokC;
    }
    public double pobierzBokD() {
        return bokD;
    }

    public void drukuj() {
        String FORMAT = " bok a: %,10.2f\n bok b: %,10.2f\n bok c: %,10.2f\n bok d: %,10.2f\n";
        System.out.println("Trapez o wymiarach:");
        System.out.printf(FORMAT, bokA, bokB, bokC, bokD);
    }
}
