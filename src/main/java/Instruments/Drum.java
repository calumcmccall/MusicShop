package Instruments;

public class Drum extends Instrument {

    private String drumKitStyle;

    public Drum(String description, int buyingPrice, int sellingPrice, String material, String colour, String drumKitStyle) {
        super(description, buyingPrice, sellingPrice, material, colour);
        this.drumKitStyle = drumKitStyle;
    }

    @Override
    public String playInstrument() {
        return "*drum snare*";
    }

}
