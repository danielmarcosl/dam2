package termometro;

/**
 *
 * @author Daniel Marcos Lorrio
 */
public class Metodos {

    /**
     * Transformar Fahrenheit a Celsius
     *
     * @param fahrenheit Grados Fahrenheit
     * @return Grados Celsius
     */
    public static String fahrenheitToCelsius(float fahrenheit) {
        float celsius = (float) ((fahrenheit - 32) / 1.8);
        return String.valueOf(celsius);
    }

    /**
     * Transformar Fahrenheit a Kelvin
     *
     * @param fahrenheit Grados Fahrenheit
     * @return Grados Kelvin
     */
    public static String fahrenheitToKelvin(float fahrenheit) {
        float kelvin = (float) ((fahrenheit - 32) / 1.8 + 273.15);
        return String.valueOf(kelvin);
    }

    /**
     * Transformar Celsius a Fahrenheit
     *
     * @param celsius Grados Celsius
     * @return Grados Fahrenheit
     */
    public static String celsiusToFahrenheit(float celsius) {
        float fahrenheit = (float) ((celsius * 1.8) + 32);
        return String.valueOf(fahrenheit);
    }

    /**
     * Transformar Celsius a Kelvin
     *
     * @param celsius Grados Celsius
     * @return Grados Kelvin
     */
    public static String celsiusToKelvin(float celsius) {
        float kelvin = (float) (celsius + 273.15);
        return String.valueOf(kelvin);
    }

    /**
     * Transformar Kelvin a Fahrenheit
     *
     * @param kelvin Grados Kelvin
     * @return Grados Fahrenheit
     */
    public static String kelvinToFahrenheit(float kelvin) {
        float fahrenheit = (float) (((kelvin - 273.15) * 1.8) + 32);
        return String.valueOf(fahrenheit);
    }

    /**
     * Transformar Kelvin a Celsius
     *
     * @param kelvin Grados Kelvin
     * @return Grados Celsius
     */
    public static String kelvinToCelsius(float kelvin) {
        float celsius = (float) (kelvin - 273.15);
        return String.valueOf(celsius);
    }
}
