package termometro;

/**
 *
 * @author Daniel Marcos Lorrio
 */
public class Termometro {

    public float calcularCelsius(float farenheit) {
        float celsius;
        celsius = (float) ((farenheit - 32) / 1.8);

        return celsius;
    }

    public float calcularFarenheit(float celsius) {
        float farenheit;
        farenheit = (float) ((celsius * 1.8) + 32);

        return farenheit;
    }

    public void actualizarValores(float celsius, float farenheit) {
        // TODO Vista.TextViewCelsius.set(celsius);
        // TODO Vista.TextViewFarenheit.set(farenheit);
        // https://netbeans.org/kb/docs/java/gui-image-display.html
    }
}
