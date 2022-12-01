package org.nicholas;

public class Colour {
    public Colour(float red, float green, float blue) {
        if (red > 1.0 || red < 0.0){
            throw new IllegalArgumentException("Values for red, green and blue must be in range 0.0 and 1.0");
        }
        if (green > 1.0 || green < 0.0){
            throw new IllegalArgumentException("Values for red, green and blue must be in range 0.0 and 1.0");
        }
        if (blue > 1.0 || blue < 0.0){
            throw new IllegalArgumentException("Values for red, green and blue must be in range 0.0 and 1.0");
        }
    }
}
