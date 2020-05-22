package klasapodstawy.zadanie1;

public class Kolo {
    // Wprowadzono 1 modyfikację

    private double radius;
    private final String text = "Kolo o promieniu";

    Kolo(double radius) throws IllegalArgumentException {
        if (radius > 0) {
            this.radius = radius;
        } else {
            // tu rzucany jest wyjątek
            throw new IllegalArgumentException();
        }
    }

    public double pole() {
        return Math.PI *radius *radius;
    }

    public double obwod() {
        return 2*Math.PI *radius;
    }

    public void ustawPromien(double radius){
        this.radius = radius;
    }

    public double pobierzPromien() {
        return radius;
    }

    public void drukuj() {
        System.out.printf(text+":\t\t%,10.2f\n", radius);
    }
}
