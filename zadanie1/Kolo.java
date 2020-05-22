package klasapodstawy.zadanie1;

public class Kolo {

    private double promien;

    Kolo(double promien) {
        if (promien > 0) {
            this.promien = promien;
        } else {
            // tu rzucany jest wyjątek
            throw new IllegalArgumentException();
        }
    }

    public double pole() {
        return Math.PI *promien *promien;
    }

    public double obwod() {
        return 2*Math.PI *promien;
    }

    public void ustawPromien(double promien){
        this.promien = promien;
    }

    public double pobierzPromien() {
        return promien;
    }

    public void drukuj() {
        System.out.printf("Kolo o promieniu:\t\t%,10.2f\n", promien);
    }
}
