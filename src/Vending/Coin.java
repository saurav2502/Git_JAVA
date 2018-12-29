package Vending;

public enum Coin {
    PENNY(1), NICKLE(5), DIME(10), QUARTER(25);

    public int getDenomination() {
        return denomination;
    }

    public Coin setDenomination(int denomination) {
        this.denomination = denomination;
        return this;
    }

    private int denomination;

    private Coin(int denomination) {
        this.denomination = denomination;
    }
}
