package hu.petrik.szuperhosprojekt;

public class Batman implements Milliardos, Szuperhos {
    private double lelemenyesseg;

    public Batman() {
        this.lelemenyesseg = 100;
    }

    @Override
    public boolean LegyozieE(Szuperhos szuperhos) {
        return szuperhos.MekkoraAzEreje()<lelemenyesseg;
    }

    @Override
    public double MekkoraAzEreje() {
        return lelemenyesseg*2;
    }

    @Override
    public void kutyuKeszit() {
        this.lelemenyesseg += 50;
    }

    public String toString() {
        String formattedLelemenyesseg = String.format("%.0f", this.lelemenyesseg);
        return "Batman: leleményesség: " + formattedLelemenyesseg;
    }

}
