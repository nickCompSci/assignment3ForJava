package org.nicholas;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ColourTest {
    @Test
    void testColourConstructor() {
        Colour testColour = new Colour(0.1f, 0.5f, 0.6f);
        assertNotNull(testColour, "Object is null.");
    }
    @Test
    void testColourConstructorWithCombinedRgbValues(){
        Colour testColourConstructor2 = new Colour(500);
        assertNotNull(testColourConstructor2, "This Colour object is null!");
    }

    @Test
    void testColourConstructorRange(){
        Exception exception = assertThrows(
                IllegalArgumentException.class,
                () ->{
                    Colour testColourRange = new Colour(2.0f, -1.2f, 3.0f);
                }
        );
        assertEquals("Values for red, green and blue must be in range 0.0 and 1.0", exception.getMessage());
    }

    @Test
    void testFloatConstructorGetterForRed(){
        Colour testRedValueOfColour = new Colour(0.2f, 0.5f, 0.3f);
        assertEquals(0.2f, testRedValueOfColour.getRedValue());
    }

    @Test
    void testFloatConstructorGetterForGreen(){
        Colour testGreenValueOfColour = new Colour(0.2f, 0.5f, 0.3f);
        assertEquals(0.5f, testGreenValueOfColour.getGreenValue());
    }

}
