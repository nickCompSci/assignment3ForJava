package org.nicholas;

/**Represents a colour in the RGB values.
 * @author Nicholas Shapovalov, 120406902
 *
 */
public class Colour {
    private final float red;
    private final float green;
    private final float blue;

    /** Constructor for the Colour class which takes in 3 floating values to
     * represent a colour as rgb values in the range 0.0 and 1.0
     *
     * @param red Floating number that represents the intensity of red.
     * @param green Floating number that represents the intensity of green.
     * @param blue Floating number that represents the intensity of blue.
     */
    public Colour(float red, float green, float blue) {
        if ((red > 1.0 || red < 0.0) && (green > 1.0 || green < 0.0) && (blue > 1.0 || blue < 0.0)){
            throw new IllegalArgumentException("Values for red, green and blue must be in range 0.0 and 1.0");
        }
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    /**Constructor for the colour class which takes an integer which represents
     * the combined rbg value of a colour in the range of 0 and 16777216. Separates the integer into respective
     * red,green,blue floating values using bit manipulation.
     *
     * @param combinedRgbValue Integer value representing combined RGB value.
     */
    public Colour(int combinedRgbValue){
        if (combinedRgbValue > 16777216 || combinedRgbValue < 0){
            throw new IllegalArgumentException("Integer Value must be in range 0 and 16777216");
        }
        int red =( combinedRgbValue >> 16) & 0xFF;
        int green = (combinedRgbValue >> 8) & 0xFF;
        int blue = (combinedRgbValue) & 0xFF;
        this.red = red / 255.0f;
        this.green = green / 255.0f;
        this.blue = blue / 255.0f;
    }

    /**
     * Gets the floating value of the red intensity of a colour.
     * @return Float value of red intensity.
     */
    public float getRedValue() {
        return this.red;
    }

    /**
     * Gets the floating value of the green intensity of a colour.
     * @return Float value of green intensity.
     */
    public float getGreenValue() {
        return this.green;
    }

    /**
     * Gets the floating value of the blue intensity of a colour.
     * @return Float value of blue intensity.
     */
    public float getBlueValue() {
        return this.blue;
    }

    @Override
    public boolean equals(Object anotherColour){
        if (anotherColour == this){
            return true;
        }
        if (!(anotherColour instanceof Colour typeCastColour)){
            return false;
        }

        return Float.compare(this.getRedValue(), typeCastColour.getRedValue()) == 0
                && Float.compare(this.getGreenValue(), typeCastColour.getGreenValue()) == 0
                && Float.compare(this.getBlueValue(), typeCastColour.getBlueValue()) == 0;
    }
}
