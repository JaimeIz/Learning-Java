package training.exercise.basic.chapter04;

import java.time.Month;
import java.time.format.TextStyle;
import java.util.Locale;

/**
 * <h2>Septimo Ejercicio.</h2>
 * Se deberá implementar una funcionalidad que reciba el número de mes y devuelva el número
 *  de días que tiene (ignorando los años bisiestos). Sólo se debe hacer algo si se recibe
 *  1 sólo argumento.
 * 
 *  @author JaimeIz
 */
public class Ejercicio08 {

    public static final String HINT = "Recuerda que van del 1 al 12.";

    public static void main(String[] args) {
        try {
            if (args.length != 1)
                throw new Exception("Necesitas introducir el número del mes.");

            int monthNumber = Integer.valueOf(args[0]);

            if (monthNumber < 0 || monthNumber > 12 )
                throw new Exception("El el mes numero \"" + monthNumber + "\" no exsiste. " + HINT);
            
            Month month = Month.of(monthNumber);

            System.out.printf("El mes numero %d es %s y tiene %d dias\n", monthNumber,
                month.getDisplayName(TextStyle.FULL, Locale.getDefault()), month.length(false));

        } catch (NumberFormatException ex) {
            System.err.println("No es un numero valido. " + HINT);
        } catch (Exception ex) {
            System.err.println(ex.getLocalizedMessage());
        }
    }
}
