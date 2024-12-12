package training.exercises.basic.chapter04;

/**
 * <h2>Cuarto Ejercicio.</h2>
 * Se deberán listar todos los argumentos que se reciban. ¿Qué pasa si no se recibe ninguno?
 * 
 *  @author JaimeIz
 */
public class Ejercicio04 {
    public static void main(String[] args) {
        try {
            if (args.length == 0)
                throw new Exception("No se ha introducido ningún argumento");

            if (args.length == 1)
                System.out.println("Se ha recivido un argumento");
            else
                System.out.printf("Se han recivido %d argumentos\n", args.length);

            String del = "\n\t- ";
            System.out.println("Se han recivido los sigientes argumentos: " + del + String.join(del, args));

        } catch (Exception ex) {
            System.err.println(ex.getLocalizedMessage());
        }
    }
}
