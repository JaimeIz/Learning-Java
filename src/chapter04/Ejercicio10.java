package chapter04;

/**
 * <h2>Septimo Ejercicio.</h2>
 * Se deberá calcular el valor absoluto de un float.
 * 
 *  @author JaimeIz
 */
public class Ejercicio10 {

    public static final String HINT = "";

    public static void main(String[] args) {
        try {
            if (args.length != 1) {
                throw new Exception("Necesitas introducir un numero.");
            }

            float number = Float.valueOf(args[0]);
            
            System.out.printf("El absoluto del numero '%.2f' es: %.2f", number, number < 0 ? number * -1 : number );

        } catch (NumberFormatException ex) {
            System.err.println("No es un numero valido o el formato es incorrecto.");
        } catch (Exception ex) {
            System.err.println(ex.getLocalizedMessage());
        }
    }
}
