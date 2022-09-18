package Instruments;

public class Guitar extends Instrument {

    private int numberOfStrings;

    public Guitar(String description, int buyingPrice, int sellingPrice, String material, String colour, int numberOfStrings) {
        super(description, buyingPrice, sellingPrice, material, colour);
        this.numberOfStrings = numberOfStrings;
    }

    @Override
    public String playInstrument() {
        return "*guitar chord*";
    }

}
