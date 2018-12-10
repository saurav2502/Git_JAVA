package Vending;

import java.util.List;

public class VendingmachineImpl implements VendingMachine {
    @Override
    public long selectItemAndGetPrice(Item item) {
        return 0;
    }

    @Override
    public void insertCoin(Coin coin) {

    }

    @Override
    public List<Coin> refund() {
        return null;
    }

    @Override
    public Bucket<Item, List<Coin>> collectItemAndChange() {
        return null;
    }

    @Override
    public void reset() {

    }
}
