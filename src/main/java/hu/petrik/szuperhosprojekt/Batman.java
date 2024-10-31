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

    @Override
    public void kutyutKeszit() {
        lelemenyesseg+=50;
    }

    @Override
    public boolean legyoziE(Szuperhos szuperhos) {
        return szuperhos.mekkoraAzEreje() < lelemenyesseg;
    }

    @Override
    public double mekkoraAzEreje() {
        return lelemenyesseg * 2;
    }
}
