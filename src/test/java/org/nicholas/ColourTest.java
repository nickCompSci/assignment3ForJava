package org.nicholas;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ColourTest {
    @Test
    void testColourConstructor() {
        Colour testColour = new Colour(0.1f, 0.5f, 0.6f);
        assertNotNull(testColour, "Object is null.");

    }
}
