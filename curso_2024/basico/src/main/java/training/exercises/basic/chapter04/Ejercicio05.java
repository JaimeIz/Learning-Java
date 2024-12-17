package training.exercises.basic.chapter04;

/**
 * <h2>Quinto Ejercicio.</h2>
 * Se deberán listar todos los argumentos que se reciban. ¿Qué pasa si no se recibe ninguno?
 * 
 *  @author JaimeIz
 */
public class Ejercicio05 {
    public static void main(String[] args) {
        try {
            if (args.length == 0)
                throw new Exception("No se ha introducido ningún argumento");

            if (args.length == 1)
                System.out.println("Se ha recivido un argumento");
            else
                System.out.printf("Se han recivido %d argumentos\n", args.length);

            System.out.print("Se han recivido los sigientes argumentos: ");

            for (int i = 0; i < args.length; i++) {
                System.out.printf("\n\t %d - %s", i, args[i]);
            }

        } catch (Exception ex) {
            System.err.println(ex.getLocalizedMessage());
        }
    }
}
