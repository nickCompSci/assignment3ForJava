package org.nicholas;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ColourTest {
    @Test
    void testFloatColourConstructor() {
        Colour testColour = new Colour(0.1f, 0.5f, 0.6f);
        assertNotNull(testColour, "This Colour object is null!");
    }

    @Test
    void testFloatColourConstructorInvalidRange(){
        Exception exception = assertThrows(
                IllegalArgumentException.class,
                () ->{
                    Colour testColour = new Colour(2.0f, -1.2f, 3.0f);
                }
        );
        assertEquals("Values for red, green and blue must be in range 0.0 and 1.0", exception.getMessage());
    }

    @Test
    void testIntegerColourConstructor(){
        Colour testColour = new Colour(500);
        assertNotNull(testColour, "This Colour object is null!");
    }

    @Test
    void testPrivateRedValueWithFloatConstructor(){
        Colour testColour = new Colour(0.2f, 0.5f, 0.3f);
        assertEquals(0.2f, testColour.getRedValue());
    }

    @Test
    void testPrivateGreenValueWithFloatConstructor(){
        Colour testGreenValueOfColour = new Colour(0.2f, 0.5f, 0.3f);
        assertEquals(0.5f, testGreenValueOfColour.getGreenValue());
    }

    @Test
    void testPrivateBlueValueWithFloatConstructor(){
        Colour testColour = new Colour(0.2f, 0.5f, 0.3f);
        assertEquals(0.3f, testColour.getBlueValue());
    }

    @Test
    void testPrivateValueForRedCombinedConstructor(){
        Colour testColour = new Colour(16777215);
        assertEquals(1.0, testColour.getRedValue());
    }
    @Test
    void testPrivateValueForGreenCombinedConstructor(){
        Colour testColour = new Colour(16777215);
        assertEquals(1.0, testColour.getGreenValue());
    }
    @Test
    void testPrivateValueForBlueCombinedConstructor(){
        Colour testColour = new Colour(16777215);
        assertEquals(1.0, testColour.getBlueValue());
    }

    @Test
    void testTwoColoursAreEqualSameConstructor(){
        Colour testColourVersionOne = new Colour(0.2f, 0.5f, 0.3f);
        Colour testColourVersionTwo = new Colour(0.2f, 0.5f, 0.3f);
        assertEquals(testColourVersionOne, testColourVersionTwo);
    }

    @Test
    void testTwoColoursAreEqualDifferentConstructor(){
        Colour testColourVersionOne = new Colour(1.0f, 1.0f, 1.0f);
        Colour testColourVersionTwo = new Colour(16777215);
        assertEquals(testColourVersionOne, testColourVersionTwo);
    }

    @Test
    void testNonEqualColours(){
        Colour testColourVersionOne = new Colour(1.0f, 1.0f, 1.0f);
        Colour testColourVersionTwo = new Colour(7777123);
        assertNotEquals(testColourVersionOne, testColourVersionTwo);
    }
}
