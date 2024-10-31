package hu.petrik.szuperhosprojekt;

public abstract class Bosszuallo implements Szuperhos{
    private double szuperero;
    private boolean vanEGyengesege;

    public Bosszuallo(double szuperero, boolean vanEGyengesege) {
        this.szuperero = szuperero;
        this.vanEGyengesege = vanEGyengesege;
    }

    @Override
    public boolean legyoziE(Szuperhos szuperhos) {
        if (szuperhos instanceof Bosszuallo) {
            return ((Bosszuallo) szuperhos).vanEGyengesege && szuperhos.mekkoraAzEreje() < this.szuperero;
        }

        if (szuperhos instanceof Batman) {
            return this.szuperero >= szuperhos.mekkoraAzEreje() * 2;
        }

        return false;
    }

    @Override
    public double mekkoraAzEreje() {
        return szuperero;
    }

    public abstract boolean megmentiAVilagot();
    public double getSzuperero() {
        return szuperero;
    }

    public boolean isVanEGyengesege() {
        return vanEGyengesege;
    }

    public void setSzuperero(double szuperero) {
        this.szuperero = szuperero;
    }

    public void setVanEGyengesege(boolean vanEGyengesege) {
        this.vanEGyengesege = vanEGyengesege;
    }
    @Override
    public String toString() {
        double szuperero = getSzuperero();

        String formattedSzuperero;
        if (szuperero == Math.floor(szuperero)) {
            formattedSzuperero = String.format("%.0f", szuperero);
        } else {
            formattedSzuperero = String.format("%.1f", szuperero);
        }

        return "Szupererő: " + formattedSzuperero + "; " + (this.vanEGyengesege ? "van" : "nincs") + " gyengesége";
    }

}
