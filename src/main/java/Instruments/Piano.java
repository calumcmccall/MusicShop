package Instruments;

public class Piano extends Instrument {

    private int numberOfKeys;

    public Piano(String description, int buyingPrice, int sellingPrice, String material, String colour, int numberOfKeys) {
        super(description, buyingPrice, sellingPrice, material, colour);
        this.numberOfKeys = numberOfKeys;
    }

    @Override
    public String playInstrument() {
        return "*piano key*";
    }

}
