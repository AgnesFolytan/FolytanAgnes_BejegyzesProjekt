package hu.petrik.szuperhosprojekt;

public class Batman implements Milliardos, Szuperhos {
    private double lelemenyesseg;

    public Batman() {
        this.lelemenyesseg = 100;
    }

    @Override
    public String toString() {
        String formattedLelemenyesseg = String.format("%.0f", this.lelemenyesseg);
        return "Batman: leleményesség: " + formattedLelemenyesseg;
    }

}
