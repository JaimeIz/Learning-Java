package training.exercise.basic.chapter04;

/**
 * <h2>Septimo Ejercicio.</h2>
 * Igual que antes, pero se deberá imprimir también la palabra de fin.
 *  ¿Qué pasa si no se recibe ninguno?
 * 
 *  @author JaimeIz
 */
public class Ejercicio07 {
    public static void main(String[] args) {
        try {
            if (args.length == 0)
                throw new Exception("No se ha introducido ningún argumento");

            String delimiter = "fin";
            
            boolean hasEnd = false;
            for (String arg : args) {
                if (arg.equalsIgnoreCase(delimiter)) {
                    hasEnd = true;
                    break;
                }
            }

            if (!hasEnd)
                throw new Exception("No tiene la palabra fin, asegurate de incluirla entre los argumentos.");

            if (args.length == 1)
                System.out.println("Se ha recivido un argumento");
            else
                System.out.printf("Se han recivido %d argumentos\n", args.length);

            System.out.print("Se han recivido los sigientes argumentos: ");

            int i = 0;
            do {
                System.out.printf("\n\t %d - %s", i, args[i]);
            } while (!args[i++].equalsIgnoreCase(delimiter));

        } catch (Exception ex) {
            System.err.println(ex.getLocalizedMessage());
        }
    }
}
