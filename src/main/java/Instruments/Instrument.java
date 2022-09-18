package Instruments;

import Interfaces.IPlay;
import Stock.ForSale;

public abstract class Instrument extends ForSale implements IPlay {

    private String material;
    private String colour;

    public Instrument(String description, int buyingPrice, int sellingPrice, String material, String colour) {
        super(description, buyingPrice, sellingPrice);
        this.material = material;
        this.colour = colour;
    }

}
