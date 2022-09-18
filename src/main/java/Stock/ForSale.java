package Stock;

import Interfaces.ISell;

public abstract class ForSale implements ISell {

    private String description;
    public int buyingPrice;
    public int sellingPrice;

    public ForSale(String description, int buyingPrice, int sellingPrice) {
        this.description = description;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }

    @Override
    public int calculateMarkup() {
        return sellingPrice - buyingPrice;
    }



}
