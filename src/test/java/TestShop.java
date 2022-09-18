import Instruments.Drum;
import Instruments.Guitar;
import Instruments.Piano;
import Interfaces.ISell;
import Stock.DrumStick;
import Stock.GuitarString;
import Stock.MusicSheet;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;

public class TestShop {

    Drum drum;
    Guitar guitar;
    Piano piano;
    DrumStick drumStick;
    GuitarString guitarString;
    MusicSheet musicSheet;
    Shop shop;

    @Before
    public void setUp(){
        drum = new Drum("Drum", 250, 300, "Steel", "Blue", "Jazz");
        guitar = new Guitar("Guitar", 150, 200, "Wood", "Orange", 6);
        piano = new Piano("Piano", 350, 500, "Wood", "White", 88);
        drumStick = new DrumStick("Drumstick", 5, 15);
        guitarString = new GuitarString("Guitar String", 3, 15);
        musicSheet = new MusicSheet("Music sheet", 1, 5);

        ArrayList<ISell> stock = new ArrayList<>();
        stock.add(drum);
        stock.add(guitar);
        stock.add(drumStick);
        stock.add(guitarString);
        stock.add(musicSheet);

        shop = new Shop(stock);
    }

    @Test
    public void shopHasStock(){
        assertEquals(5, shop.getStock().size());
    }

    @Test
    public void canAddStock(){
        shop.addToStock(piano);
        assertEquals(6, shop.getStock().size());
    }

    @Test
    public void canRemoveStock(){
        shop.removeFromStock(guitar);
        assertEquals(4, shop.getStock().size());
    }

    @Test
    public void canPlayInstrument(){
        assertEquals("*guitar chord*", guitar.playInstrument());
    }

}
