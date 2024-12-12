package exercise.basic.chapter04;

/**
 * <h2>Septimo Ejercicio.</h2>
 * Se deberá imprimir un rectángulo por la salida estándar del tamaño que se indique en
 *  los argumentos recibidos. El primer argumento será el ancho, el segundo el alto.
 *  Si el área del rectángulo pedido es múltiplo de 3, rellénalo con #, si el resto 
 *  es 1, con % y si es 2 con X.
 * 
 *  @author JaimeIz
 */
public class Ejercicio09 {

    public static final String HINT = "Los argumentos deben ser dos numeros, el primero define el ancho y el segundo la altura";

    public static void main(String[] args) {
        try {
            if (args.length != 2)
                throw new Exception("Necesitas introducir dos numeros. " + HINT);

            int width = Integer.valueOf(args[0]);
            int height = Integer.valueOf(args[1]);
            
            if (width <= 0 || width <= 0 )
                throw new Exception("Ninguno de los argumentos puede ser cero o negativo.");

            int fillModifier = (width * height) % 3;

            char fillChar = switch (fillModifier) {
                case 0 -> '#';
                case 1 -> '%';
                case 2 -> 'X';
                default -> 0;
            };

            char outerChar = '#'; 
            String space = " ";
            
            for (int i = 0; i < height; i++) {
                // first character of the row
                System.out.print(outerChar + space);
                // middle columns
                for (int j = 0; j < width - 2; j++) {
                    // differentiate between middle and outer rows 
                    if (i == 0 || i == height - 1) {
                        System.out.print(outerChar + space); // first and last
                    } else {
                        System.out.print(fillChar + space); // middle
                    }
                }
                // last character of the row
                System.out.println(outerChar + space);
            }

        } catch (NumberFormatException ex) {
            System.err.println("No es un numero valido o el formato es incorrecto.");
        } catch (Exception ex) {
            System.err.println(ex.getLocalizedMessage());
        }
    }
}
