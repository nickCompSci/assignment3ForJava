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
    @Test
    void testFloatConstructorGetterForBlue(){
        Colour testBlueValueOfColour = new Colour(0.2f, 0.5f, 0.3f);
        assertEquals(0.3f, testBlueValueOfColour.getBlueValue());
    }

    @Test
    void testCombinedConstructorValueForRed(){
        Colour testRedValueOfCombinedColour = new Colour(16777215);
        assertEquals(1.0, testRedValueOfCombinedColour.getRedValue());
    }
    @Test
    void testCombinedConstructorValueForGreen(){
        Colour testGreenValueOfCombinedColour = new Colour(16777215);
        assertEquals(1.0, testGreenValueOfCombinedColour.getGreenValue());
    }
    @Test
    void testCombinedConstructorValueForBlue(){
        Colour testBlueValueOfCombinedColour = new Colour(16777215);
        assertEquals(1.0, testBlueValueOfCombinedColour.getBlueValue());
    }

    @Test
    void testIfTwoColoursAreEqualSameConstructor(){
        Colour testColourVersionOne = new Colour(0.2f, 0.5f, 0.3f);
        Colour testColourVersionTwo = new Colour(0.2f, 0.5f, 0.3f);
        assertTrue(testColourVersionOne.equals(testColourVersionTwo));
    }

    @Test
    void testTwoColoursDifferentConstructorEqual(){
        Colour testColourVersionOne = new Colour(1.0f, 1.0f, 1.0f);
        Colour testColourVersionTwo = new Colour(16777215);
        assertTrue(testColourVersionOne.equals(testColourVersionTwo));
    }
    @Test
    void testNonEqualColours(){
        Colour testColourVersionOne = new Colour(1.0f, 1.0f, 1.0f);
        Colour testColourVersionTwo = new Colour(7777123);
        assertFalse(testColourVersionOne.equals(testColourVersionTwo));
    }
}
