package ba.unsa.etf.rpr;

public class Matematika {
    public Matematika() {
    }

    public double Sinus (int n) {
        return Math.sin(n);
    }
    public long Faktorijel(int number) {
        long result = 1;

        for (int factor = 2; factor <= number; factor++) {
            result *= factor;
        }

        return result;
    }
}

