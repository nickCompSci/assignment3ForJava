package org.nicholas;

public class Colour {
    private float red;
    private float green;
    private float blue;
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
        this.red = red;
        this.green = green;
        this.blue = blue;
    }
    public Colour(int combinedRgbValue){
        int red =( combinedRgbValue >> 16) & 0xFF;
        int green = (combinedRgbValue >> 8) & 0xFF;
        int blue = (combinedRgbValue) & 0xFF;
        this.red = red / 255.0f;
        this.green = green / 255.0f;
        this.blue = blue / 255.0f;
    }

    public float getRedValue() {
        return this.red;
    }

    public float getGreenValue() {
        return this.green;
    }

    public float getBlueValue() {
        return this.blue;
    }
}
